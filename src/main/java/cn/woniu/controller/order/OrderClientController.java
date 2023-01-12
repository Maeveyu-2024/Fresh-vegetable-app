package cn.woniu.controller.order;


import cn.woniu.entity.order.OrderClient;
import cn.woniu.entity.order.OrderSummary;
import cn.woniu.service.order.OrderClientService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * (OrderClient)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
@RestController
@RequestMapping("/orderClient")
public class OrderClientController {
    /**
     * 服务对象
     */
    @Autowired
    private OrderClientService orderClientService;

    /**
     * 查询所有,根据查询条件
     *
     * @param orderClient 查询条件
     * @return
     */
    @PostMapping("/list")
    ResponseResult<?> queryOrder(@RequestBody OrderClient orderClient, @RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        return orderClientService.queryOrder(orderClient, pageNum, pageSize);
    }

    @RequestMapping("/delete")
    public ResponseResult<?> deleteOrderByOrderId(String id) {
        return orderClientService.deleteOrderByOrderId(id);
    }

    @RequestMapping("/updateAddress")
    public ResponseResult<?> updateOrderAddress(String id, String address) {
        return orderClientService.updateOrderAddress(id, address);
    }

    @PostMapping("/updateOrder")
    public ResponseResult<?> updateOrderItem(@RequestBody OrderClient orderClient) {
        return orderClientService.updateOrderItem(orderClient);
    }

    @PostMapping("/purchase")
    public ResponseResult<?> check(@RequestBody OrderSummary orderSummary, Integer purStatus, Double saleNum) {
        return orderClientService.check(orderSummary, purStatus, saleNum);
    }
    /**
     * 查询信息给图表
     */
    @RequestMapping("/queryList")
    ResponseResult<?> queryAllByChart(String name,@RequestBody List<LocalDate> inductionTime){
        return orderClientService.queryAllByChart(name,inductionTime);
    }
    /**
     * 刷新图表
     */
    @RequestMapping("/queryAll")
    ResponseResult<?> queryAllOrderClientName(){
        return orderClientService.queryAllOrderClientName();
    }
}
