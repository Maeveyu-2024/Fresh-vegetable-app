package cn.woniu.service.material.impl;

import cn.woniu.dao.material.StandardProductsDao;
import cn.woniu.service.material.StandardProductsService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (StandardProducts)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
@Service
public class StandardProductsServiceImpl implements StandardProductsService {

    @Autowired(required = false)
    private StandardProductsDao standardProductsDao;
}

