package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.SupplierDao;
import cn.woniu.entity.manage.Supplier;
import cn.woniu.service.manage.SupplierService;
import cn.woniu.utils.ResponseResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Override
    public ResponseResult querySupplierAllByName(String name, Integer pageNo, Integer pageSize) {
        //开始分页
        PageHelper.startPage(pageNo, pageSize);
        List<Supplier> list = supplierDao.querySupplierAllByName(name);
        //把查到的数据放到pageInfo
        PageInfo pageInfo = new PageInfo(list);
        return new ResponseResult().ok(pageInfo);
    }
}

