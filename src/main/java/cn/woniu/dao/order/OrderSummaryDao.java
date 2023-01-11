package cn.woniu.dao.order;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.order.OrderSummary;

import java.util.List;

/**
 * (OrderSummary)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
public interface OrderSummaryDao extends BaseMapper<OrderSummary> {
    List<OrderSummary> queryruku();


}
