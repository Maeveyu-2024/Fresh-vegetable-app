package cn.woniu.controller.consumer;


import cn.woniu.entity.order.OrderClient;
import cn.woniu.service.consumer.ConsumerOrderService;
import cn.woniu.service.order.OrderClientService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private OrderClientService  orderClientService;

    @PostMapping("add")
    public ResponseResult<?> addOrder(@RequestBody OrderClient orderClient){
        return orderClientService.addOrder(orderClient);
    }
}
