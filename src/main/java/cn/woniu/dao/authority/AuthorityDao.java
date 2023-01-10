package cn.woniu.dao.authority;


import cn.woniu.entity.manage.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.authority.Authority;

import java.util.List;

/**
 * (Authority)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
public interface AuthorityDao extends BaseMapper<Authority> {

    //根据用户名查询用户拥有的权限
    List<Authority> selectAuthorityList(String username);
    //查询所有用户及其拥有的权限
    List<Employee> selectAllEmployeeAuth();
    //查询所有的权限列表
    List<Authority> selectAllAuthorityList();
    //删除传入的ID下所有的权限
    int deleteAllByUid(Integer id);
    //根据用户ID插入传入的权限Ids
    int insertAuthByIdsAndUid(List<Integer> ids, Integer id);
}
