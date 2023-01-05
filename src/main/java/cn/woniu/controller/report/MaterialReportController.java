package cn.woniu.controller.report;


import cn.woniu.service.report.MaterialReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (MaterialReport)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:54
 */
@RestController
@RequestMapping("/materialReport")
public class MaterialReportController {
    /**
     * 服务对象
     */
    @Autowired
    private MaterialReportService materialReportService;
}
