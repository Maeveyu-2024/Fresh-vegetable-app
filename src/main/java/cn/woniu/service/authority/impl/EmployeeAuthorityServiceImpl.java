package cn.woniu.service.authority.impl;

import cn.woniu.dao.authority.EmployeeAuthorityDao;
import cn.woniu.service.authority.EmployeeAuthorityService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (EmployeeAuthority)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:51
 */
@Service
public class EmployeeAuthorityServiceImpl implements EmployeeAuthorityService {

    @Autowired(required = false)
    private EmployeeAuthorityDao employeeAuthorityDao;
}

