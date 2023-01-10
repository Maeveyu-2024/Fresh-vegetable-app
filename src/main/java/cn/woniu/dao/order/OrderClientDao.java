package cn.woniu.dao.order;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.order.OrderClient;

import java.util.List;

/**
 * (OrderClient)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:58
 */
public interface OrderClientDao extends BaseMapper<OrderClient> {

    /**
     * 查询所有,根据查询条件
     * @param orderClient 查询条件
     * @return
     */
    List<OrderClient> queryAll(OrderClient orderClient);

}
