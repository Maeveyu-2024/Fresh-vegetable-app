package cn.woniu.controller.report;


import cn.woniu.service.report.ProductReportService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (ProductReport)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
@RestController
@RequestMapping("/productReport")
public class ProductReportController {
    /**
     * 服务对象
     */
    @Autowired
    private ProductReportService productReportService;
    /**
     * 根据产品名称查图表数据
     */
    @RequestMapping("/query")
    ResponseResult<?> queryReportByName(String name){
        return productReportService.queryReportByName(name);
    }
    /**
     * 查询全部数据
     */
    @RequestMapping("/list")
    ResponseResult<?> queryReportAllInfo(){
        return productReportService.queryReportAllInfo();
    }
    /**
     * 查询饼图数据
     */
    @RequestMapping("/circle")
    ResponseResult<?> queryDataForChart(){
       return productReportService.queryDataForChart();
    }

}
