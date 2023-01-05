package cn.woniu.service.material.impl;

import cn.woniu.dao.material.MaterialGetDao;
import cn.woniu.service.material.MaterialGetService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (MaterialGet)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@Service
public class MaterialGetServiceImpl implements MaterialGetService {

    @Autowired(required = false)
    private MaterialGetDao materialGetDao;
}

