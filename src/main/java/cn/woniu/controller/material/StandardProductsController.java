package cn.woniu.controller.material;


import cn.woniu.service.material.StandardProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (StandardProducts)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
@RestController
@RequestMapping("/standardProducts")
public class StandardProductsController {
    /**
     * 服务对象
     */
    @Autowired
    private StandardProductsService standardProductsService;
}
