package cn.woniu.controller.manage;


import cn.woniu.entity.manage.Area;
import cn.woniu.service.manage.AreaService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * (Area)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
@RestController
@RequestMapping("/area")
public class AreaController {
    /**
     * 服务对象
     */
    @Autowired
    private AreaService areaService;
    @RequestMapping("/queryArea")
    ResponseResult<?> queryAreaList(String name, Integer pageNo, Integer pageSize){
        return areaService.queryAreaList(name,pageNo,pageSize);
    }

    @PostMapping("/add")
    ResponseResult<?> addArea(@RequestBody Area area) {
        return areaService.addArea(area);
    }
    @PostMapping("/update")
    ResponseResult<?> updateArea(@RequestBody Area area){
        return areaService.updateArea(area);
    }
    @RequestMapping("/delete")
    ResponseResult<?> delArea(Long id){
        return areaService.delArea(id);
    }
    @RequestMapping("/stopArea")
    ResponseResult<?> stopStatus(Long id){
        return areaService.stopStatus(id);
    }

    @PostMapping("/delArea")
    ResponseResult<?> batchDelArea(@RequestBody Area area){
        List<Integer> ids = area.getIds();
        return areaService.batchDelArea(ids);
    }
}
