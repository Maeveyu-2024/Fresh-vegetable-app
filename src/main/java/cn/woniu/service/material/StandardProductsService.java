package cn.woniu.service.material;


import cn.woniu.entity.material.StandardProducts;
import cn.woniu.utils.ResponseResult;

/**
 * (StandardProducts)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
public interface StandardProductsService {
    ResponseResult<?> querySup();
    ResponseResult<?> querywarehouse();
    ResponseResult<?> add(StandardProducts s);
    ResponseResult<?> delete(StandardProducts s);
    ResponseResult<?> query(String id,String goodsName,String warehouse);
    ResponseResult<?> update1(StandardProducts s);



}

