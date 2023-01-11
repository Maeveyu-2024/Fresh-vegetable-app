package cn.woniu.controller.material;


import cn.woniu.entity.material.StandardProducts;
import cn.woniu.service.material.StandardProductsService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (StandardProducts)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
@RestController
@RequestMapping("/standardProducts")
public class StandardProductsController {
    /**
     * 服务对象
     */
    @Autowired
    private StandardProductsService standardProductsService;

    @RequestMapping("sup")
    private ResponseResult<?> sup(){
        return standardProductsService.querySup();
    }

    @RequestMapping("ware")
    private ResponseResult<?> ware(){
        return standardProductsService.querywarehouse();
    }
    @RequestMapping("query")
    private ResponseResult<?> query(String id, String goodsName, String warehouse,Integer pageSize,Integer pageNum){
        return standardProductsService.query(id,goodsName,warehouse,pageSize,pageNum);
    }
    @RequestMapping("query1")
    private ResponseResult<?> query1(String id, String goodsName,Integer pageSize,Integer pageNum){
        return standardProductsService.query1(id,goodsName,pageSize,pageNum);
    }
    @RequestMapping("add")
    private ResponseResult<?> add(@RequestBody StandardProducts s){
        return standardProductsService.add(s);
    }
    @RequestMapping("delete")
    private ResponseResult<?> delete(@RequestBody StandardProducts s){
        return standardProductsService.delete(s);
    }
    @RequestMapping("update")
    private ResponseResult<?> update(@RequestBody StandardProducts s){
        return standardProductsService.update1(s);
    }

    @RequestMapping("update2")
    private ResponseResult<?> update2(@RequestBody StandardProducts s){
        return standardProductsService.update2(s);
    }

}
