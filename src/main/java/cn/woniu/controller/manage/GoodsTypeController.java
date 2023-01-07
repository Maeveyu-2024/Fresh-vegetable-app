package cn.woniu.controller.manage;


import cn.woniu.service.manage.GoodsTypeService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (GoodsType)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@RestController
@RequestMapping("/goodsType")
public class GoodsTypeController {
    /**
     * 服务对象
     */
    @Autowired
    private GoodsTypeService goodsTypeService;
    @RequestMapping("/query1")
    ResponseResult<?> queryTypeList1(String name,Integer pageSize,Integer pageNum) {
        return goodsTypeService.queryType1(name,pageSize,pageNum);
    }
    @RequestMapping("/query2")
    ResponseResult<?> queryTypeList2(String id) {
        return goodsTypeService.queryType2(id);
    }
    @RequestMapping("/add1")
    ResponseResult<?> addType1(String name) {
        return goodsTypeService.addType1(name);
    }
    @RequestMapping("/add2")
    ResponseResult<?> addType2(String name,String id) {
        return goodsTypeService.addType2(name,id);
    }
    @RequestMapping("/update")
    ResponseResult<?> update(String name,String id) {
        return goodsTypeService.updateType(name,id);
    }
    @RequestMapping("/delete")
    ResponseResult<?> delete(String status,String id) {
        return goodsTypeService.deleteType(status,id);
    }

}
