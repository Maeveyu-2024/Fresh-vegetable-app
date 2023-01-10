package cn.woniu.service.order;


import cn.woniu.entity.order.OrderClient;
import cn.woniu.entity.order.OrderItem;
import cn.woniu.utils.ResponseResult;

/**
 * (OrderClient)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
public interface OrderClientService {

    /**
     * 查询所有,根据查询条件
     *
     * @param orderClient 查询条件
     * @return
     */
    ResponseResult<?> queryOrder(OrderClient orderClient, Integer pageNum, Integer pageSize);

    /**
     * 删除订单表,根据id
     * @param id
     * @return
     */
    ResponseResult<?> deleteOrderByOrderId(String id);

    /**
     * 修改订单地址
     *
     * @param id      订单id
     * @param address 订单地址
     * @return
     */
    ResponseResult<?> updateOrderAddress(String id, String address);

    /**
     * 修改订单项
     * @param orderClient
     * @return
     */
    ResponseResult<?> updateOrderItem(OrderClient orderClient);

}

