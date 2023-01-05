package cn.woniu.controller.order;


import cn.woniu.service.order.OrderSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (OrderSummary)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
@RestController
@RequestMapping("/orderSummary")
public class OrderSummaryController {
    /**
     * 服务对象
     */
    @Autowired
    private OrderSummaryService orderSummaryService;
}
