package cn.woniu.service.report.impl;

import cn.woniu.dao.report.MaterialReportDao;
import cn.woniu.service.report.MaterialReportService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (MaterialReport)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:54
 */
@Service
public class MaterialReportServiceImpl implements MaterialReportService {

    @Autowired(required = false)
    private MaterialReportDao materialReportDao;
}

