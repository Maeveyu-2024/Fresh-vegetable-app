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

    /**
     * 通过传入id和要修改的status更新员工的状态
     * @param id
     * @param status
     * @return
     */
    int updateEmployeeStatusById(Integer id , Integer status);

    /**
     * 修改员工信息
     * @param employee
     * @return
     */
    int updateEmployeeInfo(Employee employee);

    /**
     * 新增员工
     * @param employee
     * @return
     */
    int insertEmployee(Employee employee);
    /**
     * 查询员工状态
     */
    int selectEmployeeStatus(String username);

    /**
     * 查询用户名是否已存在
     */
    Employee selectUsernameExist(String username);
}
