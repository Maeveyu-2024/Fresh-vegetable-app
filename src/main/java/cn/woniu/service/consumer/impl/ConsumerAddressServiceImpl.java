package cn.woniu.service.consumer.impl;

import cn.woniu.dao.consumer.ConsumerAddressDao;
import cn.woniu.service.consumer.ConsumerAddressService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (ConsumerAddress)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@Service
public class ConsumerAddressServiceImpl implements ConsumerAddressService {

    @Autowired(required = false)
    private ConsumerAddressDao consumerAddressDao;
}

