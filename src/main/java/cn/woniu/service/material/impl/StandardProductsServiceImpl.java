package cn.woniu.service.material.impl;

import cn.woniu.dao.manage.GoodsDao;
import cn.woniu.dao.manage.MeasuringUnitDao;
import cn.woniu.dao.manage.SupplierDao;
import cn.woniu.dao.manage.WarehouseDao;
import cn.woniu.dao.material.StandardProductsDao;
import cn.woniu.dao.order.OrderSummaryDao;
import cn.woniu.dao.report.ProductReportDao;
import cn.woniu.entity.manage.Goods;
import cn.woniu.entity.manage.GoodsType;
import cn.woniu.entity.manage.MeasuringUnit;
import cn.woniu.entity.manage.Warehouse;
import cn.woniu.entity.material.StandardProducts;
import cn.woniu.entity.order.OrderSummary;
import cn.woniu.entity.report.ProductReport;
import cn.woniu.service.material.StandardProductsService;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
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
    @Autowired(required = false)
    private MeasuringUnitDao measuringUnitDao;
    @Autowired(required = false)
    private OrderSummaryDao orderSummaryDao;
    @Autowired(required = false)
    private ProductReportDao productReportDao;






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

            QueryWrapper<Goods> queryWrapper=new QueryWrapper<Goods>();
            queryWrapper.eq("name",s.getGoodsName());
            Goods goods = goodsDao.selectOne(queryWrapper);
            s.setGoodsId(goods.getId());
            List<MeasuringUnit> list = measuringUnitDao.queryAlList();
            if (list.size()>0){
                for (MeasuringUnit unit:list
                ) {
                    if (s.getUnitId().equals(unit.getName())){
                        s.setUnitId(unit.getId());
                    }
                }
            }
            s.setStatus(0);
            LocalDate date = LocalDate.now();
            s.setTime(date);
            s.setDeleted(0);
            int count = standardProductsDao.insert(s);



        if(count==1){
            QueryWrapper<OrderSummary> q = new QueryWrapper<>();
            OrderSummary orderSummary = orderSummaryDao.selectById(s.getNo());
            orderSummary.setStatus("0");
            int i = orderSummaryDao.updateById(orderSummary);
            if (i==1)
            return new ResponseResult<>().ok(count);
            else return ResponseResult.FAILURE;
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
    public ResponseResult<?> query(String id, String goodsName, String warehouse,Integer pageSize,Integer pageNum) {
//        List<StandardProducts> list = standardProductsDao.query(id, goodsName, warehouse);
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<StandardProducts> pageInfo = new PageInfo<>(standardProductsDao.query(id, goodsName, warehouse));

        return new ResponseResult<>().ok(pageInfo);
    }

    @Override
    public ResponseResult<?> update1(StandardProducts s) {
        List<MeasuringUnit> list = measuringUnitDao.queryAlList();
        for (MeasuringUnit e:list
             ) {
            if(e.getId().equals(s.getUnitId()))
                s.setUnitName(e.getName());
        }

        QueryWrapper<ProductReport> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("pro_name",s.getGoodsName());
        if(s.getStatus()==0){
            Goods goods = goodsDao.selectById(s.getGoodsId());
            goods.setPurStatus(0);
            goodsDao.updateById(goods);
            s.setStatus(1);
           if(productReportDao.exists(queryWrapper)){
               ProductReport one = productReportDao.selectOne(queryWrapper);
                one.setProNum(s.getNum()+one.getProNum());
               productReportDao.updateById(one);
           }else{
               ProductReport p = new ProductReport();
               p.setProName(s.getGoodsName());
               p.setUnitName(s.getUnitName());
               p.setProNum(s.getNum());
               productReportDao.insert(p);
           }

        }
        else{
            ProductReport one = productReportDao.selectOne(queryWrapper);
            one.setProNum(one.getProNum()-s.getNum());
            productReportDao.updateById(one);
            s.setStatus(0);
        }
        int count = standardProductsDao.updateById(s);
        if(count==1){
            return new ResponseResult<>().ok(count);
        }
        else return ResponseResult.FAILURE;
    }

    @Override
    public ResponseResult<?> update2(StandardProducts s) {
        int count = standardProductsDao.updateById(s);
        if(count==1){
            return new ResponseResult<>().ok(count);
        }
        else return ResponseResult.FAILURE;
    }

    @Override
    public ResponseResult<?> query1(String id, String goodsName, Integer pageSize, Integer pageNum) {
        QueryWrapper<ProductReport> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("pro_name",goodsName);
        queryWrapper.like("id",id);
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<ProductReport> pageInfo = new PageInfo<>(productReportDao.selectList(queryWrapper));
        return new ResponseResult<>().ok(pageInfo);


    }

    @Override
    public ResponseResult<?> query2(String id, String goodsName, Integer pageSize, Integer pageNum) {
        QueryWrapper<OrderSummary> q = new QueryWrapper<>();
        q.like("id",id);
        q.like("goods_name",goodsName);
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<OrderSummary> pageInfo = new PageInfo<>(orderSummaryDao.selectList(q));
        return new ResponseResult<>().ok(pageInfo);
    }


}

