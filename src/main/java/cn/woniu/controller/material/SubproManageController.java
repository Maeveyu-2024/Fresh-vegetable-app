package cn.woniu.controller.material;


import cn.woniu.service.material.SubproManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (SubproManage)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
@RestController
@RequestMapping("/subproManage")
public class SubproManageController {
    /**
     * 服务对象
     */
    @Autowired
    private SubproManageService subproManageService;
}
