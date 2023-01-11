package cn.woniu.controller.consumer;


import cn.woniu.service.consumer.ConsumerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
