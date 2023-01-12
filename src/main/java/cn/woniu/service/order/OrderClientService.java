package cn.woniu.service.order;


import cn.woniu.entity.order.OrderClient;
import cn.woniu.entity.order.OrderItem;
import cn.woniu.utils.ResponseResult;

import java.time.LocalDate;
import java.util.List;

import cn.woniu.entity.order.OrderSummary;

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
     *
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
     *
     * @param orderClient
     * @return
     */
    ResponseResult<?> updateOrderItem(OrderClient orderClient);

    /**
     * 修改订单状态, 生成采购计划
     *
     * @param orderSummary
     * @return
     */
    ResponseResult<?> check(OrderSummary orderSummary, Integer purStatus, Double saleNum);

    /**
     * 添加订单
     *
     * @param orderClient
     * @return
     */
    ResponseResult<?> addOrder(OrderClient orderClient);

    /**
     * 修改订单状态
     *
     * @param id     订单id
     * @param status 订单状态
     * @return
     */
    ResponseResult<?> updateOrderStatus(String id, Integer status);

    /**
     * 查询信息给图表
     *
     * @param name
     * @param inductionTime
     * @return
     */
    ResponseResult<?> queryAllByChart(String name, List<LocalDate> inductionTime);

    /**
     * 刷新图表
     */
    ResponseResult<?> queryAllOrderClientName();

    ResponseResult<?> orderStatusUpdate(String orderId, Integer nextStatus);
}

