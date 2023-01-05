package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.GoodsDao;
import cn.woniu.service.manage.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (Goods)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired(required = false)
    private GoodsDao goodsDao;
}

