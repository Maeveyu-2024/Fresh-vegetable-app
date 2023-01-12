package cn.woniu.service.consumer.impl;

import cn.woniu.dao.consumer.ConsumerCartDao;
import cn.woniu.dao.consumer.ConsumerDao;
import cn.woniu.dao.manage.GoodsTypeDao;
import cn.woniu.entity.consumer.Consumer;
import cn.woniu.entity.consumer.ConsumerCart;
import cn.woniu.entity.manage.GoodsType;
import cn.woniu.redis.CartRedisRepository;
import cn.woniu.service.consumer.ConsumerCartService;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;


/**
 * (ConsumerCart)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@Service
public class ConsumerCartServiceImpl implements ConsumerCartService {

    @Autowired(required = false)
    private ConsumerCartDao consumerCartDao;
    @Autowired(required = false)
    private ConsumerDao consumerDao;
    @Autowired(required = false)
    private GoodsTypeDao goodsTypeDao;
    @Resource
    private CartRedisRepository cartRedisRepository;

    @Override
    public ResponseResult CartAdd(ConsumerCart cart) {
        String userName = cart.getUserId();
        Integer result = 0;
        //获取用户ID
        QueryWrapper<Consumer> consumerWrapper = new QueryWrapper<Consumer>();
        consumerWrapper.select("id").eq("user_name", cart.getUserId());
        Consumer consumer = consumerDao.selectOne(consumerWrapper);
        cart.setUserId(consumer.getId());
        //获取商品类型
        QueryWrapper<GoodsType> goodsTypeQueryWrapper = new QueryWrapper<GoodsType>();
        goodsTypeQueryWrapper.select("name").eq("id", cart.getGoodType());
        GoodsType goodsType = goodsTypeDao.selectOne(goodsTypeQueryWrapper);
        cart.setGoodType(goodsType.getName());
        //判断购物车是否有同样商品
        QueryWrapper<ConsumerCart> cartQueryWrapper = new QueryWrapper<ConsumerCart>();
        cartQueryWrapper.eq("good_id", cart.getGoodId());
        Long row = consumerCartDao.selectCount(cartQueryWrapper);
        if (row != 0) {
            ConsumerCart consumerCart = consumerCartDao.selectOne(cartQueryWrapper);
            consumerCart.setGoodNum(Integer.parseInt(consumerCart.getGoodNum()) +
                    Integer.parseInt(cart.getGoodNum()) + "");
            result = consumerCartDao.updateById(consumerCart);
        } else {
            result = consumerCartDao.insert(cart);
        }
        List<ConsumerCart> consumerCarts = consumerCartDao.queryAllCart(userName);
        cartRedisRepository.saveAll(consumerCarts);
        return new ResponseResult().ok(result);
    }

    @Override
    public ResponseResult queryCartAll(String userName) {
        QueryWrapper<Consumer> wrapper = new QueryWrapper<Consumer>();
        wrapper.eq("user_name", userName);
        Consumer consumer = consumerDao.selectOne(wrapper);
        Iterable<ConsumerCart> carts = cartRedisRepository.findByUserId(consumer.getId());
        if (carts.iterator().hasNext()) {
            return new ResponseResult<>().ok(carts);
        }
        List<ConsumerCart> consumerCarts = consumerCartDao.queryAllCart(userName);
        cartRedisRepository.saveAll(consumerCarts);
        return new ResponseResult<>().ok(consumerCarts);
    }

    @Override
    public ResponseResult CartDel(String id) {
        cartRedisRepository.deleteById(id);
        return new ResponseResult().ok(consumerCartDao.deleteById(id));
    }

    @Override
    public ResponseResult GoodsDelInBatchs(List<String> ids) {
        cartRedisRepository.deleteAllById(ids);
        int row = consumerCartDao.deleteBatchIds(ids);
        if (row != 0) {
            return new ResponseResult().ok(row);
        } else {
            return new ResponseResult(500, "失败", 0);
        }
    }
}

