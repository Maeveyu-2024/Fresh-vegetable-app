package cn.woniu.controller.manage;


import cn.woniu.entity.manage.Goods;
import cn.woniu.entity.manage.MeasuringUnit;
import cn.woniu.entity.manage.Supplier;
import cn.woniu.entity.manage.Goods;
import cn.woniu.service.manage.GoodsService;
import cn.woniu.service.manage.GoodsTypeService;
import cn.woniu.service.manage.MeasuringUnitService;
import cn.woniu.service.manage.SupplierService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Autowired
    private GoodsService goodsService;


    /**
     * 查询商品列表
     * @param goods
     * @return
     */
    @PostMapping("queryGoods")
    public ResponseResult<?> queryGoods(@RequestBody Goods goods){
        return goodsService.queryGoodsList(goods);
    }

    /**
     * 查询商品类别列表
     * @return
     */
    @RequestMapping("queryGoodsType")
    public ResponseResult<?> queryGoods(){
        return goodsService.queryGoodsTypeList();
    }
    /**
     * 查询单位列表
     * @return
     */
    @RequestMapping("queryUnitName")
    public ResponseResult<?> queryUnitName(){
        return goodsService.queryUnitNameList();
    }
    /**
     * 查询商品类别列表
     * @return
     */
    @RequestMapping("querySupplier")
    public ResponseResult<?> querySupplier(){
        return goodsService.querySupplierList();
    }

    /**
     * 添加商品
     * @param goods
     * @return
     */
    @PostMapping("addGoods")
    public ResponseResult<?> addGoods(@RequestBody Goods goods){
        return goodsService.addGoods(goods);
    }

    /**
     * 修改商品
     * @param goods
     * @return
     */
    @PostMapping("updateGoods")
    public ResponseResult<?> updateGoods(@RequestBody Goods goods){
        return goodsService.updateGoods(goods);
    }

    /**
     * 逻辑删除商品
     * @return
     */
    @RequestMapping("deleteGoods")
    public ResponseResult<?> deleteGoods(String id,Integer status){
        return goodsService.deleteGoods(id,status);
    }
    /**
     * 更新仓库商品
     * @return
     */
    @RequestMapping("updateGoodsStatus")
    public ResponseResult<?> updateGoodsStatus(String id,Integer status){
        return goodsService.updateGoodsStatus(id,status);
    }







}
