package cn.woniu.service.consumer;


import cn.woniu.entity.order.OrderClient;
import cn.woniu.utils.ResponseResult;

/**
 * (ConsumerOrder)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
public interface ConsumerOrderService {

    /**
     * 查询所有,根据查询条件
     *
     * @param orderClient 查询条件
     * @return
     */
    ResponseResult<?> queryOrderAll(OrderClient orderClient, Integer pageNum, Integer pageSize);

}

