package cn.woniu.service.consumer.impl;

import cn.woniu.dao.consumer.ConsumerDao;
import cn.woniu.dao.manage.GoodsTypeDao;
import cn.woniu.entity.consumer.Consumer;
import cn.woniu.entity.manage.Goods;
import cn.woniu.entity.manage.GoodsType;
import cn.woniu.service.consumer.ConsumerService;
import cn.woniu.utils.Md5;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * (Consumer)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired(required = false)
    private ConsumerDao consumerDao;
    @Autowired(required = false)
    private GoodsTypeDao goodsTypeDao;

    /**
     * 登陆
     *
     * @param userName
     * @param userPwd
     * @return
     */
    @Override
    public ResponseResult consumerLogin(String userName, String userPwd) {
        QueryWrapper<Consumer> wrapper = new QueryWrapper<Consumer>();
        wrapper.eq("user_name", userName).eq("user_pwd", Md5.md5(userPwd));
        Consumer consumer = consumerDao.selectOne(wrapper);
        if (consumer != null) {
            return new ResponseResult().ok(consumer);
        } else {
            return new ResponseResult(500, "失败");
        }
    }

    /**
     * 注册
     *
     * @return
     */
    @Override
    public ResponseResult consumerRegister(Consumer consumer) {
        consumer.setUserPwd(Md5.md5(consumer.getUserPwd()));
        int row = consumerDao.insert(consumer);
        if (row != 0) {
            return new ResponseResult().ok(consumer);
        } else {
            return new ResponseResult(500, "失败");
        }
    }

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public ResponseResult QueryAllConsumer() {
        return new ResponseResult().ok(consumerDao.selectList(null));
    }

    @Override
    public ResponseResult queryAllGoodsInMall(String name, String typeId, Integer pageNo, Integer pageSize) {
        //开始分页
        PageHelper.startPage(pageNo, pageSize);
        List<Goods> list = consumerDao.queryAllGoodsInMall(name, typeId);
        //把查到的数据放到pageInfo
        PageInfo pageInfo = new PageInfo(list);
        return new ResponseResult().ok(pageInfo);
    }

    @Override
    public ResponseResult queryAllGoodTypeInMall() {
        QueryWrapper<GoodsType> wrapper = new QueryWrapper<GoodsType>();
        wrapper.select("id", "name").ne("parent_id", ' ').eq("status", 1);
        return new ResponseResult().ok(goodsTypeDao.selectList(wrapper));
    }
}

