package cn.woniu.service.order.impl;

import cn.woniu.dao.order.OrderClientDao;
import cn.woniu.service.order.OrderClientService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


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
}

