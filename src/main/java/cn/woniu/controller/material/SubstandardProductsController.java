package cn.woniu.controller.material;


import cn.woniu.service.material.SubstandardProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (SubstandardProducts)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:02
 */
@RestController
@RequestMapping("/substandardProducts")
public class SubstandardProductsController {
    /**
     * 服务对象
     */
    @Autowired
    private SubstandardProductsService substandardProductsService;
}
