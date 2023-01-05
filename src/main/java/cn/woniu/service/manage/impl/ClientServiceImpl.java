package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.ClientDao;
import cn.woniu.service.manage.ClientService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (Client)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired(required = false)
    private ClientDao clientDao;
}

