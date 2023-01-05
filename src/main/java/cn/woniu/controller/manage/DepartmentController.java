package cn.woniu.controller.manage;


import cn.woniu.service.manage.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Department)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:51
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {
    /**
     * 服务对象
     */
    @Autowired
    private DepartmentService departmentService;
}
