package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.MeasuringUnitDao;
import cn.woniu.entity.manage.Area;
import cn.woniu.entity.manage.MeasuringUnit;
import cn.woniu.service.manage.MeasuringUnitService;
import cn.woniu.utils.ResponseResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * (MeasuringUnit)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:58
 */
@Service
public class MeasuringUnitServiceImpl implements MeasuringUnitService {

    @Autowired(required = false)
    private MeasuringUnitDao measuringUnitDao;

    @Override
    public ResponseResult<?> queryMeasuringUnitList(String name,Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<MeasuringUnit> measuringUnits = measuringUnitDao.queryMeasuringUnitList(name);
        PageInfo<MeasuringUnit> measuringInfo = new PageInfo<>(measuringUnits);
        return new ResponseResult<>(200,"查询计量单位表",measuringInfo);
    }

    @Override
    public ResponseResult<?> addMeasuringUnit(MeasuringUnit measuringUnit) {
        measuringUnitDao.addMeasuringUnit(measuringUnit);
        return new ResponseResult<>(200,"添加计量单位表");
    }

    @Override
    public ResponseResult<?> updateMeasuringUnit(MeasuringUnit measuringUnit) {
        measuringUnitDao.updateMeasuringUnit(measuringUnit);
        return new ResponseResult<>(200,"修改计量单位表");
    }

    @Override
    public ResponseResult<?> delMeasuringUnit(Long id) {
        measuringUnitDao.delMeasuringUnit(id);
        return new ResponseResult<>(200,"删除此计量单位");
    }

    @Override
    public ResponseResult<?> stopStatus(Long id) {
        measuringUnitDao.stopStatus(id);
        return new ResponseResult<>(200,"停用此计量单位");
    }

    @Override
    public ResponseResult<?> openStatus(Long id) {
        measuringUnitDao.openStatus(id);
        return new ResponseResult<>(200,"启用此计量单位");
    }

    @Override
    public ResponseResult<?> queryAlList() {
        List<MeasuringUnit> measuringUnits = measuringUnitDao.queryAlList();
        return new ResponseResult<>(200,"查询全部计量单位",measuringUnits);
    }

    @Override
    public ResponseResult<?> queryOtherMUById(Long id) {
        Integer integer = measuringUnitDao.queryOtherMUById(id);
        if (integer>0){
            return new ResponseResult<>(201,"存在商品");
        }else{
            return new ResponseResult<>(202,"不存在商品");
        }
    }
}

