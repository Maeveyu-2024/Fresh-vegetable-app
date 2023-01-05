package cn.woniu.controller.consumer;


import cn.woniu.service.consumer.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Consumer)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    /**
     * 服务对象
     */
    @Autowired
    private ConsumerService consumerService;
}
