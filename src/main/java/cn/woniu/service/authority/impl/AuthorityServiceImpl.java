package cn.woniu.service.authority.impl;

import cn.woniu.dao.authority.AuthorityDao;
import cn.woniu.service.authority.AuthorityService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (Authority)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired(required = false)
    private AuthorityDao authorityDao;
}

