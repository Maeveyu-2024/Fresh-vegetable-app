package cn.woniu.controller.manage;


import cn.woniu.entity.manage.MeasuringUnit;
import cn.woniu.service.manage.MeasuringUnitService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (MeasuringUnit)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:58
 */
@RestController
@RequestMapping("/measure")
public class MeasuringUnitController {
    /**
     * 服务对象
     */
    @Autowired
    private MeasuringUnitService measuringUnitService;
    /**
     * 查询计量单位表数据
     */
    @RequestMapping("/query")
    ResponseResult<?> queryMeasuringUnitList(String name , Integer pageNo, Integer pageSize){
        return measuringUnitService.queryMeasuringUnitList(name,pageNo,pageSize);
    }
    /**
     * 添加计量单位
     */
    @PostMapping("/add")
    ResponseResult<?>  addMeasuringUnit(@RequestBody MeasuringUnit measuringUnit){
        return measuringUnitService.addMeasuringUnit(measuringUnit);
    }
    /**
     * 修改计量单位表
     */
    @PostMapping("/update")
    ResponseResult<?>  updateMeasuringUnit(@RequestBody MeasuringUnit measuringUnit){
        return measuringUnitService.updateMeasuringUnit(measuringUnit);
    }
    /**
     * 逻辑删除计量单位表数据
     */
    @RequestMapping("/delete")
    ResponseResult<?>  delMeasuringUnit(Long id) {
        return measuringUnitService.delMeasuringUnit(id);
    }
    /**
     * 停用计量单位
     */
    @RequestMapping("/stop")
    ResponseResult<?>  stopStatus(Long id){
        return measuringUnitService.stopStatus(id);
    }
    /**
     * 开启计量单位
     */
    @RequestMapping("/open")
    ResponseResult<?>  openStatus(Long id){
        return measuringUnitService.openStatus(id);
    }
    /**
     * 查询全部计量单位
     */
    @RequestMapping("/list")
    ResponseResult<?>  queryAlList(){
        return measuringUnitService.queryAlList();
    }
    /**
     * 查询名下使用者数量
     */
    @RequestMapping("/count")
    ResponseResult<?>  queryOtherMUById(Long id){
        return measuringUnitService.queryOtherMUById(id);
    }
}
