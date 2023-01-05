package cn.woniu.controller.order;


import cn.woniu.service.order.OrderClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
