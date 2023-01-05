package cn.woniu.service.material.impl;

import cn.woniu.dao.material.SubstandardProductsDao;
import cn.woniu.service.material.SubstandardProductsService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (SubstandardProducts)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:02
 */
@Service
public class SubstandardProductsServiceImpl implements SubstandardProductsService {

    @Autowired(required = false)
    private SubstandardProductsDao substandardProductsDao;
}

