package cn.woniu.dao.manage;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.manage.Employee;

import java.time.LocalDate;
import java.util.List;

/**
 * (Employee)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:51
 */
public interface EmployeeDao extends BaseMapper<Employee> {

    /**
     * 查询用户信息,根据账户
     *
     * @param username 用户账户
     * @return 返回用户信息及权限
     */
    Employee queryEmployeeByUsername(String username);

    /**
     * 条件查询用户列表
     * @param employee
     * @return
     */
    List<Employee> queryEmployeeList(Employee employee);

    int updateEmployeeStatusById(Integer id , Integer status);
}
