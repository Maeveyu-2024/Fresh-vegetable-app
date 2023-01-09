package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.GoodsDao;
import cn.woniu.dao.manage.SupplierDao;
import cn.woniu.entity.manage.Client;
import cn.woniu.entity.manage.Goods;
import cn.woniu.entity.manage.Supplier;
import cn.woniu.service.manage.AreaService;
import cn.woniu.service.manage.ClientService;
import cn.woniu.service.manage.SupplierService;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Wrapper;
import java.util.Arrays;
import java.util.List;


/**
 * (Supplier)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:02
 */
@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired(required = false)
    private SupplierDao supplierDao;
    @Autowired(required = false)
    private GoodsDao goodsDao;
    @Autowired(required = false)
    private ClientService clientServic;


    /**
     * 条件查询供应商列表
     *
     * @param name
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public ResponseResult querySupplierAllByName(String name, Integer pageNo, Integer pageSize) {
        //开始分页
        PageHelper.startPage(pageNo, pageSize);
        List<Supplier> list = supplierDao.querySupplierAllByName(name);
        list.forEach(supplier -> {
            String[] s = supplier.getAreaValue().split(" ");
            supplier.setAreaValues(Arrays.asList(s));
        });
        //把查到的数据放到pageInfo
        PageInfo pageInfo = new PageInfo(list);
        return new ResponseResult().ok(pageInfo);
    }

    /**
     * 供应商新增
     *
     * @param supplier
     * @return
     */
    @Override
    public ResponseResult SupplierAdd(Supplier supplier) {
        String areaId = clientServic.getAreaId(supplier.getAreaName(), supplier.getAreaValues());
        supplier.setAreaId(areaId);
        int row = supplierDao.insert(supplier);
        if (row != 0) {
            return new ResponseResult().ok(row);
        } else {
            return new ResponseResult(500, "失败");
        }
    }

    /**
     * 供应商修改
     *
     * @param supplier
     * @return
     */
    @Override
    public ResponseResult SupplierUpdate(Supplier supplier) {
        String areaId = clientServic.getAreaId(supplier.getAreaName(), supplier.getAreaValues());
        supplier.setAreaId(areaId);
        int row = supplierDao.updateById(supplier);
        if (row != 0) {
            return new ResponseResult().ok(row);
        } else {
            return new ResponseResult(500, "失败");
        }
    }

    /**
     * 供应商冻结/解冻/逻辑删除
     *
     * @param id
     * @param operate
     * @return
     */
    @Override
    public ResponseResult SupplierStatusUpdate(String id, Integer operate) {
        if (operate == 0) {//逻辑删除
            QueryWrapper<Goods> queryWrapper = new QueryWrapper<Goods>();
            queryWrapper.eq("supplier_id", id);
            Long counts = goodsDao.selectCount(queryWrapper);
            if (counts == 0) {//判断是否关联有商品
                UpdateWrapper<Supplier> wrapper = new UpdateWrapper<Supplier>();
                wrapper.eq("id", id).set("status", 0);
                int row = supplierDao.update(new Supplier(), wrapper);
                return new ResponseResult().ok(row);
            } else {
                return new ResponseResult(500, "失败");
            }
        } else if (operate == 1) {//解冻
            UpdateWrapper<Supplier> wrapper = new UpdateWrapper<Supplier>();
            wrapper.eq("id", id).set("status", 1);
            int row = supplierDao.update(new Supplier(), wrapper);
            return new ResponseResult().ok(row);
        } else if (operate == 2) {//冻结
            QueryWrapper<Goods> queryWrapper = new QueryWrapper<Goods>();
            queryWrapper.eq("supplier_id", id);
            Long counts = goodsDao.selectCount(queryWrapper);
            if (counts == 0) {//判断是否关联有商品
                UpdateWrapper<Supplier> wrapper = new UpdateWrapper<Supplier>();
                wrapper.eq("id", id).set("status", 2);
                int row = supplierDao.update(new Supplier(), wrapper);
                return new ResponseResult().ok(row);
            } else {
                return new ResponseResult(500, "失败");
            }
        } else {
            return new ResponseResult(500, "失败");
        }
    }
}

