package cn.woniu.service.order.impl;

import cn.woniu.dao.order.OrderShoppinglistDao;
import cn.woniu.service.order.OrderShoppinglistService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (OrderShoppinglist)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
@Service
public class OrderShoppinglistServiceImpl implements OrderShoppinglistService {

    @Autowired(required = false)
    private OrderShoppinglistDao orderShoppinglistDao;
}

