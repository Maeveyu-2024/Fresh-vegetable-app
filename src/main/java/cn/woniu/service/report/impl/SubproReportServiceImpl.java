package cn.woniu.service.report.impl;

import cn.woniu.dao.report.PayReportDao;
import cn.woniu.service.report.SubproReportService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (SubproReport)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
@Service
public class SubproReportServiceImpl implements SubproReportService {

    @Autowired(required = false)
    private PayReportDao subproReportDao;
}

