package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.GoodsTypeDao;
import cn.woniu.service.manage.GoodsTypeService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (GoodsType)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired(required = false)
    private GoodsTypeDao goodsTypeDao;
}

