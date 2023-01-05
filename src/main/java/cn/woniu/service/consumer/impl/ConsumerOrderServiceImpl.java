package cn.woniu.service.consumer.impl;

import cn.woniu.dao.consumer.ConsumerOrderDao;
import cn.woniu.service.consumer.ConsumerOrderService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (ConsumerOrder)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@Service
public class ConsumerOrderServiceImpl implements ConsumerOrderService {

    @Autowired(required = false)
    private ConsumerOrderDao consumerOrderDao;
}

