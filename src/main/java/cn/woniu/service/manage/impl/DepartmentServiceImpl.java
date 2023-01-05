package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.DepartmentDao;
import cn.woniu.service.manage.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


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
}

