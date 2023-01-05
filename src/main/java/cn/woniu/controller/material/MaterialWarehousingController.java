package cn.woniu.controller.material;


import cn.woniu.service.material.MaterialWarehousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (MaterialWarehousing)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:54
 */
@RestController
@RequestMapping("/materialWarehousing")
public class MaterialWarehousingController {
    /**
     * 服务对象
     */
    @Autowired
    private MaterialWarehousingService materialWarehousingService;
}
