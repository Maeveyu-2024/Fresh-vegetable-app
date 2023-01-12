package cn.woniu.controller.consumer;


import cn.woniu.entity.consumer.ConsumerCart;
import cn.woniu.service.consumer.ConsumerCartService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (ConsumerCart)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@RestController
@RequestMapping("/consumer/consumerCart")
public class ConsumerCartController {
    /**
     * 服务对象
     */
    @Autowired
    private ConsumerCartService consumerCartService;

    @PostMapping("/add")
    public ResponseResult CartAdd(@RequestBody ConsumerCart cart) {
        return consumerCartService.CartAdd(cart);
    }

    @RequestMapping("/list")
    public ResponseResult CartList(String name) {
        return consumerCartService.queryCartAll(name);
    }

    @RequestMapping("/del")
    public ResponseResult CartDel(String id) {
        return consumerCartService.CartDel(id);
    }
}
