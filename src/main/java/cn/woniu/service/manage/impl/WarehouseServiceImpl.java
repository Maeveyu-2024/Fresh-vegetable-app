package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.WarehouseDao;
import cn.woniu.service.manage.WarehouseService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (Warehouse)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:03
 */
@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired(required = false)
    private WarehouseDao warehouseDao;
}

