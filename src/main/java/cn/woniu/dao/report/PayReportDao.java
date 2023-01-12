package cn.woniu.dao.report;


import cn.woniu.entity.report.PayReport;

import java.util.List;

/**
 * (SubproReport)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
public interface PayReportDao {

    List<PayReport> queryDataForChart();//饼图数据查询

}
