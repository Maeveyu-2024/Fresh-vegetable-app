package cn.woniu.service.material.impl;

import cn.woniu.dao.material.ProductSendDao;
import cn.woniu.service.material.ProductSendService;
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
}

