package cn.woniu.controller.authority;


import cn.woniu.service.authority.AuthorityService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @RequestMapping("auth")
    public ResponseResult<?> queryAuthList(String username){
        return authorityService.queryAuthorityList(username);
    }
    @RequestMapping("authList")
    public ResponseResult<?> queryAllAuthList(){
        return authorityService.queryAllAuthority();
    }
    @RequestMapping("allAuthList")
    public ResponseResult<?> selectAllAuthList(){
        return authorityService.selectAllAuthority();
    }
    @PostMapping("updateAuth")
    public ResponseResult<?> updateAuthByUid(@RequestBody List<Integer> ids, Integer id){
        return authorityService.updateAuthByUid(ids,id);
    }
}
