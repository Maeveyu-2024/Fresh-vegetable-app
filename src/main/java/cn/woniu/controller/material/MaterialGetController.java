package cn.woniu.controller.material;


import cn.woniu.service.material.MaterialGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (MaterialGet)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@RestController
@RequestMapping("/materialGet")
public class MaterialGetController {
    /**
     * 服务对象
     */
    @Autowired
    private MaterialGetService materialGetService;
}
