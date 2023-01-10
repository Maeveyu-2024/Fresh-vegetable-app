package cn.woniu.service.order.impl;

import cn.woniu.dao.order.OrderClientDao;
import cn.woniu.dao.order.OrderItemDao;
import cn.woniu.entity.manage.Client;
import cn.woniu.entity.order.OrderClient;
import cn.woniu.entity.order.OrderItem;
import cn.woniu.service.order.OrderClientService;
import cn.woniu.utils.ResponseResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


/**
 * (OrderClient)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
@Service
public class OrderClientServiceImpl implements OrderClientService {

    @Autowired(required = false)
    private OrderClientDao orderClientDao;


    @Override
    public ResponseResult<?> queryOrder(OrderClient orderClient, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<OrderClient> pageInfo = new PageInfo<>(orderClientDao.queryAll(orderClient));
        return new ResponseResult<>().ok(pageInfo);
    }

    @Override
    public ResponseResult<?> deleteOrderByOrderId(String id) {
        OrderClient orderClient = orderClientDao.selectById(id);
        if (orderClient.getStatus() == 3) {
            Integer count = orderClientDao.updateOrderByOrderId(id);
            return new ResponseResult<>().ok(count);
        }
        return ResponseResult.FAILURE;
    }

    @Override
    public ResponseResult<?> updateOrderAddress(String id, String address) {
        Integer count = orderClientDao.updataOrderAddress(id, address);
        if (count > 0) {
            return new ResponseResult<>().ok(count);
        }
        return ResponseResult.FAILURE;
    }

    @Override
    @Transactional
    public ResponseResult<?> updateOrderItem(OrderClient orderClient) {
        orderClientDao.updateOrderMoney(orderClient.getId(), orderClient.getTotalMoney());
        Integer count = orderClientDao.updateOrderItem(orderClient.getOrderItemList());
        return new ResponseResult<>().ok(count);
    }
}

