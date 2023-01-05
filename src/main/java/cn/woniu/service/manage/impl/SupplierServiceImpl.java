package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.SupplierDao;
import cn.woniu.service.manage.SupplierService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (Supplier)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:02
 */
@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired(required = false)
    private SupplierDao supplierDao;
}

