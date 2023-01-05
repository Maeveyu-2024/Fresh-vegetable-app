package cn.woniu.service.report.impl;

import cn.woniu.dao.report.ProductReportDao;
import cn.woniu.service.report.ProductReportService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (ProductReport)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
@Service
public class ProductReportServiceImpl implements ProductReportService {

    @Autowired(required = false)
    private ProductReportDao productReportDao;
}

