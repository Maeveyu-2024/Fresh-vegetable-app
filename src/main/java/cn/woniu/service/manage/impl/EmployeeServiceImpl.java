package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.EmployeeDao;
import cn.woniu.service.manage.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


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
}

