package cn.woniu.controller.consumer;


import cn.woniu.service.consumer.ConsumerAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (ConsumerAddress)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@RestController
@RequestMapping("/consumerAddress")
public class ConsumerAddressController {
    /**
     * 服务对象
     */
    @Autowired
    private ConsumerAddressService consumerAddressService;
}
