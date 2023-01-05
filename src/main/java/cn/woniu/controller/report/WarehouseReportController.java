package cn.woniu.controller.report;


import cn.woniu.service.report.WarehouseReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (WarehouseReport)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:03
 */
@RestController
@RequestMapping("/warehouseReport")
public class WarehouseReportController {
    /**
     * 服务对象
     */
    @Autowired
    private WarehouseReportService warehouseReportService;
}
