package cn.woniu.service.report.impl;

import cn.woniu.dao.report.PayReportDao;
import cn.woniu.dao.report.ProductReportDao;
import cn.woniu.entity.report.PayReport;
import cn.woniu.entity.report.ProductReport;
import cn.woniu.service.report.ProductReportService;
import cn.woniu.utils.ResponseResult;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


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
    @Autowired(required = false)
    private PayReportDao payReportDao;

    @Override
    public ResponseResult<?> queryReportByName(String name) {
        ProductReport productReport = productReportDao.queryReportByName(name);
        return new ResponseResult<>(200,"查询成功",productReport);
    }

    @Override
    public ResponseResult<?> queryReportAllInfo() {
        List<ProductReport> productReports =
                productReportDao.queryReportAllInfo();
        return new ResponseResult<>(200,"查询成功",productReports);
    }

    @Override
    public ResponseResult<?> queryDataForChart() {
        List<PayReport> payReports = payReportDao.queryDataForChart();
        return new ResponseResult<>(200,"查询成功",payReports);
    }
}

