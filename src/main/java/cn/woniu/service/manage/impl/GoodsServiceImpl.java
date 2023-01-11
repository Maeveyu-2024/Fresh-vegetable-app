package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.GoodsDao;
import cn.woniu.dao.manage.GoodsTypeDao;
import cn.woniu.dao.manage.MeasuringUnitDao;
import cn.woniu.dao.manage.SupplierDao;
import cn.woniu.dao.material.StandardProductsDao;
import cn.woniu.entity.manage.*;
import cn.woniu.entity.material.StandardProducts;
import cn.woniu.service.manage.GoodsService;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


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

    @Autowired(required = false)
    private GoodsTypeDao goodsTypeDao;

    @Autowired(required = false)
    private MeasuringUnitDao measuringUnitDao;

    @Autowired(required = false)
    private SupplierDao supplierDao;

    @Autowired(required = false)
    private StandardProductsDao standardProductsDao;


    @Override
    public ResponseResult<?> queryGoodsList(Goods goods) {
        PageHelper.startPage(goods.getPageNo(),goods.getPageSize());
        List<Goods> goodsList = goodsDao.queryGoodsList(goods);
        PageInfo<Goods> pageInfo = new PageInfo<>(goodsList);
        return new ResponseResult<>().ok(pageInfo);
    }

    @Override
    public ResponseResult<?> queryGoodsTypeList() {
        List<GoodsType> goodsTypes = goodsTypeDao.selectList(null);
        List<GoodsType> collect = goodsTypes.stream().filter(e -> e.getStatus() == 1).collect(Collectors.toList());
        return new ResponseResult<>().ok(collect);
    }

    @Override
    public ResponseResult<?> queryUnitNameList() {
        List<MeasuringUnit> measuringUnits = measuringUnitDao.queryAlList();
        List<MeasuringUnit> collect = measuringUnits.stream().filter(e -> e.getStatus() == 1).collect(Collectors.toList());
        return new ResponseResult<>().ok(collect);
    }

    @Override
    public ResponseResult<?> querySupplierList() {
        List<Supplier> suppliers = supplierDao.selectList(null);
        List<Supplier> collect = suppliers.stream().filter(e -> e.getStatus() == 1).collect(Collectors.toList());
        return new ResponseResult<>().ok(collect);
    }

    @Override
    public ResponseResult<?> addGoods(Goods goods) {
        goods.setUpdateTime(LocalDate.now());
        int count = goodsDao.insert(goods);
        return new ResponseResult<>().ok(count);
    }

    @Override
    public ResponseResult<?> updateGoods(Goods goods) {
        int count = goodsDao.updateById(goods);
        return new ResponseResult<>().ok(count);
    }

    @Override
    public ResponseResult<?> deleteGoods(String id, Integer status) {
        QueryWrapper<StandardProducts> goodsId = new QueryWrapper<StandardProducts>().eq("goods_id", id);
        List<StandardProducts> standardProducts = standardProductsDao.selectList(goodsId);
        if(standardProducts.size()==0){
            int count = goodsDao.updateGoodsStatusById(id, status);
            return new ResponseResult<>().ok(count);
        }else{
            return new ResponseResult(2004,"该商品被占用");
        }

    }

    @Override
    public ResponseResult<?> updateGoodsStatus(String id, Integer status) {
        int count = goodsDao.updateGoodsStatusById(id, status);
        return new ResponseResult<>().ok(count);
    }


}

