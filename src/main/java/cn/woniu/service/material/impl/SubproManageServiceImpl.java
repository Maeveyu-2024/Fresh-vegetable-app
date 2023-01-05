package cn.woniu.service.material.impl;

import cn.woniu.dao.material.SubproManageDao;
import cn.woniu.service.material.SubproManageService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (SubproManage)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
@Service
public class SubproManageServiceImpl implements SubproManageService {

    @Autowired(required = false)
    private SubproManageDao subproManageDao;
}

