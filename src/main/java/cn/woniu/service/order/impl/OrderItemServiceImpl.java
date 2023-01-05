package cn.woniu.service.order.impl;

import cn.woniu.dao.order.OrderItemDao;
import cn.woniu.service.order.OrderItemService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (OrderItem)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired(required = false)
    private OrderItemDao orderItemDao;
}

