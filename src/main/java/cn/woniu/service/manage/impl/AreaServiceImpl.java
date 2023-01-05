package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.AreaDao;
import cn.woniu.entity.manage.Area;
import cn.woniu.redis.RedisRepository;
import cn.woniu.service.manage.AreaService;

import cn.woniu.utils.ResponseResult;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


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

    @Autowired
    private RedisRepository redisRepository;

    @Override
    public ResponseResult<?> queryAreaList(String name, Integer pageNo, Integer pageSize) {
        return null;
    }

    @Override
    public ResponseResult<?> addArea(Area area) {
        return null;
    }

    @Override
    public ResponseResult<?> updateArea(Area area) {
        return null;
    }

    @Override
    public ResponseResult<?> delArea(Long id) {
        return null;
    }

    @Override
    public ResponseResult<?> stopStatus(Long id) {
        return null;
    }

    @Override
    public ResponseResult<?> batchDelArea(List<Integer> ids) {
        return null;
    }
}

