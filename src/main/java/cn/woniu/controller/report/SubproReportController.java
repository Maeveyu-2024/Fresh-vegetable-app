package cn.woniu.controller.report;


import cn.woniu.service.report.SubproReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (SubproReport)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:02
 */
@RestController
@RequestMapping("/subproReport")
public class SubproReportController {
    /**
     * 服务对象
     */
    @Autowired
    private SubproReportService subproReportService;
}
