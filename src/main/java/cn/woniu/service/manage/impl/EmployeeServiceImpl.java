package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.EmployeeDao;
import cn.woniu.entity.manage.Employee;
import cn.woniu.service.manage.EmployeeService;
import cn.woniu.utils.ResponseResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.stream.Collectors;


/**
 * (Employee)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:51
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired(required = false)
    private EmployeeDao employeeDao;

    @Override
    public ResponseResult<?> queryEmployeeList(Employee employee,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Employee> employees = employeeDao.queryEmployeeList(employee);
        //过滤后会把集合变成ArrayList失去分页效果,直接改xml
//        List<Employee> collect = employees.stream().filter(e -> e.getStatus() != 2).collect(Collectors.toList());
        PageInfo<Employee> pageInfo = new PageInfo(employees);
        return new ResponseResult<>().ok(pageInfo);
    }

    @Override
    public ResponseResult<?> changeEmployeeStatusById(Integer id, Integer status) {
        return new ResponseResult<>().ok(employeeDao.updateEmployeeStatusById(id,status));
    }

    @Override
    public ResponseResult<?> updateEmployeeInfo(Employee employee) {
        return new ResponseResult<>().ok(employeeDao.updateEmployeeInfo(employee));
    }

    @Override
    public ResponseResult<?> addEmployee(Employee employee) {
        return new ResponseResult<>().ok(employeeDao.insertEmployee(employee));
    }
}

