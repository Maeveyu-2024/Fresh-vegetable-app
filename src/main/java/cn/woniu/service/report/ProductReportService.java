package cn.woniu.service.report;


import cn.woniu.entity.report.PayReport;
import cn.woniu.entity.report.ProductReport;
import cn.woniu.utils.ResponseResult;

import java.util.List;

/**
 * (ProductReport)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
public interface ProductReportService {
    ResponseResult<?> queryReportByName(String name);
    ResponseResult<?> queryReportAllInfo();
    ResponseResult<?> queryDataForChart();//饼图数据查询
    ResponseResult<?> queryDataForGoodsSales();//商品销量数据
    ResponseResult<?> queryDataForGoodsInventory();//成品库存图表数据
}

