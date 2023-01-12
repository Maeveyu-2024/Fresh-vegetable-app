package cn.woniu.dao.consumer;


import cn.woniu.entity.order.OrderClient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.consumer.ConsumerOrder;

import java.util.List;

/**
 * (ConsumerOrder)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
public interface ConsumerOrderDao extends BaseMapper<ConsumerOrder> {

    /**
     * 查询所有,根据查询条件
     *
     * @param orderClient 查询条件
     * @return
     */
    List<OrderClient> queryOrderAll(OrderClient orderClient);

}
