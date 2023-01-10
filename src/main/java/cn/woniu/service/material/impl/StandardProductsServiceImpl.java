package cn.woniu.service.material.impl;

import cn.woniu.dao.manage.GoodsDao;
import cn.woniu.dao.manage.SupplierDao;
import cn.woniu.dao.manage.WarehouseDao;
import cn.woniu.dao.material.StandardProductsDao;
import cn.woniu.entity.manage.Goods;
import cn.woniu.entity.manage.Warehouse;
import cn.woniu.entity.material.StandardProducts;
import cn.woniu.service.material.StandardProductsService;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * (StandardProducts)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
@Service
public class StandardProductsServiceImpl implements StandardProductsService {

    @Autowired(required = false)
    private StandardProductsDao standardProductsDao;
    @Autowired(required = false)
    private WarehouseDao warehouseDao;
    @Autowired(required = false)
    private SupplierDao supplierDao;
    @Autowired(required = false)
    private GoodsDao goodsDao;
    @Override
    public ResponseResult<?> querySup() {
        List list = supplierDao.selectList(null);
        return new ResponseResult<>().ok(list);
    }

    @Override
    public ResponseResult<?> querywarehouse() {
        List list = warehouseDao.selectList(null);
        return new ResponseResult<>().ok(list);    }

    @Override
    public ResponseResult<?> add(StandardProducts s) {
        int count = standardProductsDao.insert(s);
        if(count==1){
            return new ResponseResult<>().ok(count);
        }
        else return ResponseResult.FAILURE;
    }

    @Override
    public ResponseResult<?> delete(StandardProducts s) {
        s.setDeleted(1);
        int count = standardProductsDao.updateById(s);
        if(count==1){
            return new ResponseResult<>().ok(count);
        }
        else return ResponseResult.FAILURE;
    }


    @Override
    public ResponseResult<?> query(String id, String goodsName, String warehouse) {
        List<StandardProducts> list = standardProductsDao.query(id, goodsName, warehouse);


        return new ResponseResult<>().ok(list);
    }

    @Override
    public ResponseResult<?> update1(StandardProducts s) {
        if(s.getStatus()==1)
            s.setStatus(0);
        else
            s.setStatus(1);
        int count = standardProductsDao.updateById(s);
        if(count==1){
            return new ResponseResult<>().ok(count);
        }
        else return ResponseResult.FAILURE;
    }


}

