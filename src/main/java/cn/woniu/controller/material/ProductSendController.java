package cn.woniu.controller.material;


import cn.woniu.service.material.ProductSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (ProductSend)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
@RestController
@RequestMapping("/productSend")
public class ProductSendController {
    /**
     * 服务对象
     */
    @Autowired
    private ProductSendService productSendService;
}
