package cn.woniu.service.material.impl;

import cn.woniu.dao.material.ProductSendDao;
import cn.woniu.entity.material.ProductSend;
import cn.woniu.entity.order.OrderSummary;
import cn.woniu.service.material.ProductSendService;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (ProductSend)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
@Service
public class ProductSendServiceImpl implements ProductSendService {

    @Autowired(required = false)
    private ProductSendDao productSendDao;

    @Override
    public ResponseResult<?> updateLimit(Double limit, String id) {
        productSendDao.updateGoodsLimit(id,limit);
        productSendDao.updateLimitById(id,limit);
        return new ResponseResult<>().ok("1");
    }
}

