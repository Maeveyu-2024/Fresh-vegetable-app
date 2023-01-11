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
    ResponseResult<?> query(String id,String goodsName,String warehouse,Integer pageSize,Integer pageNum);
    ResponseResult<?> update1(StandardProducts s);
    ResponseResult<?> update2(StandardProducts s);
    ResponseResult<?> query1(String id,String goodsName,Integer pageSize,Integer pageNum);
    ResponseResult<?> query2(String id,String goodsName,Integer pageSize,Integer pageNum);





}

