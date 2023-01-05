package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.AreaDao;
import cn.woniu.service.manage.AreaService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (Area)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired(required = false)
    private AreaDao areaDao;
}

