package cn.woniu.controller.authority;


import cn.woniu.service.authority.EmployeeAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (EmployeeAuthority)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
@RestController
@RequestMapping("/employeeAuthority")
public class EmployeeAuthorityController {
    /**
     * 服务对象
     */
    @Autowired
    private EmployeeAuthorityService employeeAuthorityService;
}
