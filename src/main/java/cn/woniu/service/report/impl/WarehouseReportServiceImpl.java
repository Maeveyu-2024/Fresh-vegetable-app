package cn.woniu.service.report.impl;

import cn.woniu.dao.report.WarehouseReportDao;
import cn.woniu.service.report.WarehouseReportService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (WarehouseReport)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:03
 */
@Service
public class WarehouseReportServiceImpl implements WarehouseReportService {

    @Autowired(required = false)
    private WarehouseReportDao warehouseReportDao;
}

