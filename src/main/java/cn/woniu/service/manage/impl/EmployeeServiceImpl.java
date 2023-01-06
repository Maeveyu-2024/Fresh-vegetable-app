package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.EmployeeDao;
import cn.woniu.entity.manage.Employee;
import cn.woniu.service.manage.EmployeeService;
import cn.woniu.utils.ResponseResult;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;


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
    public ResponseResult<?> queryEmployeeList(Employee employee) {
        return new ResponseResult<>().ok(employeeDao.queryEmployeeList(employee));
    }

    @Override
    public ResponseResult<?> changeEmployeeStatusById(Integer id, Integer status) {
        return new ResponseResult<>().ok(employeeDao.updateEmployeeStatusById(id,status));
    }
}

