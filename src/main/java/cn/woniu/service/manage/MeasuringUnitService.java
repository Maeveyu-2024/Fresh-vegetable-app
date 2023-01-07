package cn.woniu.service.manage;


import cn.woniu.entity.manage.MeasuringUnit;
import cn.woniu.utils.ResponseResult;

import java.util.List;

/**
 * (MeasuringUnit)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:58
 */
public interface MeasuringUnitService {
    ResponseResult<?> queryMeasuringUnitList(String name ,Integer pageNo, Integer pageSize);//查询计量单位表数据
    ResponseResult<?>  addMeasuringUnit(MeasuringUnit measuringUnit);//添加计量单位
    ResponseResult<?>  updateMeasuringUnit(MeasuringUnit measuringUnit);//修改计量单位表
    ResponseResult<?>  delMeasuringUnit(Long id);//逻辑删除计量单位表数据
    ResponseResult<?>  stopStatus(Long id);//停用计量单位
    ResponseResult<?>  openStatus(Long id);//开启计量单位
    ResponseResult<?>  queryAlList();//查询全部计量单位
    ResponseResult<?>  queryOtherMUById(Long id);//查询名下使用者数量

}

