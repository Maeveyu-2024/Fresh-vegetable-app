package cn.woniu.service.consumer.impl;

import cn.woniu.dao.consumer.ConsumerDao;
import cn.woniu.service.consumer.ConsumerService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


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
}

