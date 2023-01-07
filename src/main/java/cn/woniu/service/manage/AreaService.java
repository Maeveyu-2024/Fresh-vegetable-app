package cn.woniu.service.manage;


import cn.woniu.entity.manage.Area;
import cn.woniu.utils.ResponseResult;

import java.util.List;

/**
 * (Area)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
public interface AreaService {
    ResponseResult<?> queryAreaList(String name, Integer pageNo, Integer pageSize);//查询area表数据
    ResponseResult<?> addArea(Area area);//添加area表数据
    ResponseResult<?> updateArea(Area area);//修改area表数据
    ResponseResult<?> delArea(Long id);//逻辑删除area表数据
    ResponseResult<?> stopStatus(Long id);//停用area表数据
    ResponseResult<?> batchDelArea(List<Integer> ids);//批量删除area表数据
    ResponseResult<?> queryAllAreaList();//查询全部地区
    ResponseResult<?> queryOtherAreaById(Long id);//
    ResponseResult<?> openStatus(Long id);//开始area表数据

}

