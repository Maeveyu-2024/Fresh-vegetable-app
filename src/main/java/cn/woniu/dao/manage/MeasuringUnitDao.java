package cn.woniu.dao.manage;


import cn.woniu.entity.manage.Area;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.manage.MeasuringUnit;

import java.util.List;

/**
 * (MeasuringUnit)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:58
 */
public interface MeasuringUnitDao  {
    List<MeasuringUnit> queryMeasuringUnitList(String name);//查询计量单位表数据
    void addMeasuringUnit(MeasuringUnit measuringUnit);//添加计量单位
    void updateMeasuringUnit(MeasuringUnit measuringUnit);//修改计量单位表
    void delMeasuringUnit(Long id);//逻辑删除计量单位表数据
    void stopStatus(Long id);//停用计量单位
    void openStatus(Long id);//开启计量单位
    List<MeasuringUnit> queryAlList();//查询全部计量单位
    Integer queryOtherMUById(Long id);//查询名下使用者数量

}
