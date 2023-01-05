package cn.woniu.controller.order;


import cn.woniu.service.order.OrderShoppinglistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (OrderShoppinglist)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
@RestController
@RequestMapping("/orderShoppinglist")
public class OrderShoppinglistController {
    /**
     * 服务对象
     */
    @Autowired
    private OrderShoppinglistService orderShoppinglistService;
}
