package cn.woniu.controller.authority;


import cn.woniu.service.authority.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Authority)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
@RestController
@RequestMapping("/authority")
public class AuthorityController {
    /**
     * 服务对象
     */
    @Autowired
    private AuthorityService authorityService;
}
