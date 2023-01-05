package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.MeasuringUnitDao;
import cn.woniu.service.manage.MeasuringUnitService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (MeasuringUnit)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:58
 */
@Service
public class MeasuringUnitServiceImpl implements MeasuringUnitService {

    @Autowired(required = false)
    private MeasuringUnitDao measuringUnitDao;
}

