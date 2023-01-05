package cn.woniu.service.material.impl;

import cn.woniu.dao.material.MaterialWarehousingDao;
import cn.woniu.service.material.MaterialWarehousingService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (MaterialWarehousing)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:54
 */
@Service
public class MaterialWarehousingServiceImpl implements MaterialWarehousingService {

    @Autowired(required = false)
    private MaterialWarehousingDao materialWarehousingDao;
}

