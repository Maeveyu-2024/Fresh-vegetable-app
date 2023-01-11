package cn.woniu.dao.report;


import cn.woniu.entity.report.MaterialReport;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.report.ProductReport;

import java.util.List;

/**
 * (ProductReport)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
public interface ProductReportDao extends BaseMapper<ProductReport> {
        ProductReport queryReportByName(String name);//根据产品名查询对应图表的数据
        List<ProductReport> queryReportAllInfo();//查询全部信息

}
