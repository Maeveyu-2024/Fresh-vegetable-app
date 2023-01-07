package cn.woniu.service.manage;


import cn.woniu.utils.ResponseResult;

/**
 * (GoodsType)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
public interface GoodsTypeService {
    ResponseResult<?> queryType1(String name,Integer pageSize,Integer pageNum);
    ResponseResult<?> queryType2(String id);
    ResponseResult<?> addType1(String name);
    ResponseResult<?> addType2(String name,String id);
    ResponseResult<?> updateType(String name,String id);
    ResponseResult<?> deleteType(String status,String id);





}

