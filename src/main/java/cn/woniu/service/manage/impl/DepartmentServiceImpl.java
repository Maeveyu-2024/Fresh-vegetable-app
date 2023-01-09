package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.DepartmentDao;
import cn.woniu.entity.manage.Department;
import cn.woniu.entity.manage.Employee;
import cn.woniu.service.manage.DepartmentService;
import cn.woniu.utils.ResponseResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;


/**
 * (Department)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:51
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired(required = false)
    private DepartmentDao departmentDao;

    @Override
    public ResponseResult<?> queryDeptList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Department> departments = departmentDao.selectDeptList();
        PageInfo<Employee> pageInfo = new PageInfo(departments);
        return new ResponseResult<>().ok(pageInfo);
    }

    @Override
    public ResponseResult<?> updateDeptStatus(Integer id, Integer status) {
        List<Employee> employees = departmentDao.selectEmployeeByDeptId(id);
        if(employees.size() != 0){
            return new ResponseResult<>().ok("该部门下有员工");
        } else {
            return new ResponseResult<>().ok(departmentDao.updateDeptStatus(id,status));
        }
    }

    @Override
    public ResponseResult<?> queryDeptName(String name) {
        Department department = departmentDao.selectDeptByName(name);
        return new ResponseResult<>().ok(department);
    }

    @Override
    public ResponseResult<?> addDept(String name) {
        return new ResponseResult<>().ok(departmentDao.insert(new Department(name,LocalDate.now())));
    }

    @Override
    public ResponseResult<?> updateDeptInfo(String id, String name) {
        Department department = new Department();
        department.setId(id);
        department.setName(name);
        department.setUpdateTime(LocalDate.now());
        return new ResponseResult<>().ok(departmentDao.updateById(department));
    }
}

