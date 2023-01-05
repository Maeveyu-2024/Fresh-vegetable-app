package cn.woniu.service.order.impl;

import cn.woniu.dao.order.OrderSummaryDao;
import cn.woniu.service.order.OrderSummaryService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (OrderSummary)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
@Service
public class OrderSummaryServiceImpl implements OrderSummaryService {

    @Autowired(required = false)
    private OrderSummaryDao orderSummaryDao;
}

