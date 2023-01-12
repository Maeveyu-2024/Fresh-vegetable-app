package cn.woniu.controller.consumer;


import cn.woniu.entity.order.OrderClient;
import cn.woniu.entity.order.OrderSummary;
import cn.woniu.service.consumer.ConsumerOrderService;
import cn.woniu.service.finance.FinanceQueryService;
import cn.woniu.service.order.OrderClientService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * (ConsumerOrder)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@RestController
@RequestMapping("/consumer/consumerOrder")
public class ConsumerOrderController {
    /**
     * 服务对象
     */
    @Autowired
    private ConsumerOrderService consumerOrderService;
    @Autowired
    private OrderClientService orderClientService;
    /**
     * 服务对象
     */
    @Autowired
    private FinanceQueryService financeQueryService;

    @PostMapping("add")
    public ResponseResult<?> addOrder(@RequestBody OrderClient orderClient) {
        return orderClientService.addOrder(orderClient);
    }

    /**
     * 查询所有,根据查询条件
     *
     * @param orderClient 查询条件
     * @return
     */
    @PostMapping("/list")
    ResponseResult<?> queryOrder(@RequestBody OrderClient orderClient, @RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        return consumerOrderService.queryOrderAll(orderClient, pageNum, pageSize);
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
    public ResponseResult<?> check(@RequestBody OrderSummary orderSummary) {
        return orderClientService.check(orderSummary);
    }

    /**
     * 添加应收款订单
     * 当订单状态为3(订单完成)之后向应收款插入一条应收款订单
     * 传入两个参数即可:
     * totalMoney:订单总金额
     * id:订单id
     *
     * @param totalMoney
     * @param id
     * @return
     */
    @RequestMapping("addFinance")
    public ResponseResult<?> addFinance(Double totalMoney, String id) {
        return financeQueryService.addFinance(totalMoney, id);
    }

    /**
     * 修改应收款订单状态和订单时间
     * 当订单付款之后,把订单状态设为1,并且传入订单支付完成时间
     * 传两个参数
     * payTime:订单完成时间
     * id:订单id
     *
     * @param payTime
     * @param id
     * @return
     */
    @RequestMapping("updateFinance")
    public ResponseResult<?> updateFinance(LocalDate payTime, String id) {
        return financeQueryService.updateFinance(payTime, id);
    }
}
