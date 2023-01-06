package cn.woniu.service.manage;


import cn.woniu.entity.manage.Supplier;
import cn.woniu.utils.ResponseResult;

import java.util.List;

/**
 * (Supplier)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:39:02
 */
public interface SupplierService {

    ResponseResult querySupplierAllByName(String name, Integer pageNo, Integer pageSize);

}

