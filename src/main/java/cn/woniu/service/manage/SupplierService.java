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
    /**
     * 条件查询供应商列表
     *
     * @param name
     * @param pageNo
     * @param pageSize
     * @return
     */
    ResponseResult querySupplierAllByName(String name, Integer pageNo, Integer pageSize);

    /**
     * 供应商新增
     *
     * @param supplier
     * @return
     */
    ResponseResult SupplierAdd(Supplier supplier);

    /**
     * 供应商修改
     *
     * @param supplier
     * @return
     */
    ResponseResult SupplierUpdate(Supplier supplier);

    /**
     * 供应商冻结/解冻/逻辑删除
     *
     * @param id
     * @param operate
     * @return
     */
    ResponseResult SupplierStatusUpdate(String id, Integer operate);


}

