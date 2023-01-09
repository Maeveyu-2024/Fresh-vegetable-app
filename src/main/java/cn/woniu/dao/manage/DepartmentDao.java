package cn.woniu.dao.manage;


import cn.woniu.entity.manage.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.manage.Department;

import java.util.List;

/**
 * (Department)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
public interface DepartmentDao extends BaseMapper<Department> {
    //查询部门列表
    List<Department> selectDeptList();
    //更新部门状态
    int updateDeptStatus(Integer id, Integer status);
    //通过传入的name查询数据库是否存在
    Department selectDeptByName(String name);
    //删除和禁用时需要将部门ID放到员工表查询是否有员工
    List<Employee> selectEmployeeByDeptId(Integer id);
}
