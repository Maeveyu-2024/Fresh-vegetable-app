package cn.woniu.controller.manage;


import cn.woniu.service.manage.MeasuringUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (MeasuringUnit)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:58
 */
@RestController
@RequestMapping("/measuringUnit")
public class MeasuringUnitController {
    /**
     * 服务对象
     */
    @Autowired
    private MeasuringUnitService measuringUnitService;
}
