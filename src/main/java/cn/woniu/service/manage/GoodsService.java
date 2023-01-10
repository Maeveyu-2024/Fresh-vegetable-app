package cn.woniu.service.manage;


import cn.woniu.entity.manage.Goods;
import cn.woniu.entity.manage.Warehouse;
import cn.woniu.utils.ResponseResult;

/**
 * (Goods)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
public interface GoodsService {
    /**
     * 查询商品列表
     * @param goods
     * @return
     */
    ResponseResult<?> queryGoodsList(Goods goods);

    /**
     * 查询商品类别
     * @return
     */
    ResponseResult<?> queryGoodsTypeList();

    /**
     * 查询商品单位
     */
    ResponseResult<?> queryUnitNameList();

    /**
     * 查询供应商
     * @return
     */
    ResponseResult<?> querySupplierList();

    /**
     * 新增仓库
     * @return
     */
    ResponseResult<?> addGoods(Goods goods);

    /**
     * 修改商品
     *
     * @return
     */
    ResponseResult<?> updateGoods(Goods goods);

    /**
     * 逻辑删除商品
     * @param id
     * @return
     */
    ResponseResult<?> deleteGoods(String id,Integer status);

    /**
     * 修改商品状态
     * @param id
     * @param status
     * @return
     */
    ResponseResult<?> updateGoodsStatus(String id,Integer status);







}

