package cn.woniu.service.consumer.impl;

import cn.woniu.dao.consumer.ConsumerCartDao;
import cn.woniu.service.consumer.ConsumerCartService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


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
}

