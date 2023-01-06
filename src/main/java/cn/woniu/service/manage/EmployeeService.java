package cn.woniu.service.manage;


import cn.woniu.entity.manage.Employee;
import cn.woniu.utils.ResponseResult;

import java.time.LocalDate;

/**
 * (Employee)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:51
 */
public interface EmployeeService {
    ResponseResult<?> queryEmployeeList(Employee employee);
    ResponseResult<?> changeEmployeeStatusById(Integer id, Integer status);
}

