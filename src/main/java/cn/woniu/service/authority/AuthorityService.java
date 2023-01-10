package cn.woniu.service.authority;


import cn.woniu.utils.ResponseResult;

import java.util.List;

/**
 * (Authority)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
public interface AuthorityService {
    ResponseResult<?> queryAuthorityList(String username);
    ResponseResult<?> queryAllAuthority();
    ResponseResult<?> selectAllAuthority();
    ResponseResult<?> updateAuthByUid(List<Integer> ids, Integer id);
}

