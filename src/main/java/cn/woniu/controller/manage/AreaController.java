package cn.woniu.controller.manage;


import cn.woniu.service.manage.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Area)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
@RestController
@RequestMapping("/area")
public class AreaController {
    /**
     * 服务对象
     */
    @Autowired
    private AreaService areaService;
}
