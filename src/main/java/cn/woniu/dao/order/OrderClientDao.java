package cn.woniu.dao.order;


import cn.woniu.entity.manage.MeasuringUnit;
import cn.woniu.entity.order.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.order.OrderClient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (OrderClient)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:58
 */
public interface OrderClientDao extends BaseMapper<OrderClient> {

    /**
     * 查询所有,根据查询条件
     *
     * @param orderClient 查询条件
     * @return
     */
    List<OrderClient> queryAll(@Param("oc") OrderClient orderClient);


    /**
     * 查询分页总条数
     *
     * @param orderClient
     * @return
     */
    Integer pageCount(OrderClient orderClient);

    /**
     * 逻辑删除订单及关联的表
     *
     * @param id
     * @return
     */
    Integer updateOrderByOrderId(String id);

    /**
     * 修改订单地址
     *
     * @param id      订单id
     * @param address 订单地址
     * @return
     */
    Integer updataOrderAddress(String id, String address);

    /**
     * 修改订单金额
     *
     * @param id
     * @param totalMoney
     * @return
     */
    Integer updateOrderMoney(String id, Double totalMoney);

    /**
     * 修改订单项
     *
     * @return
     */
    Integer updateOrderItem(List<OrderItem> orderItemList);

    /**
     * 修改订单状态
     * @param id
     * @return
     */
    Integer updateOrderStatus(String id);

    /**
     * 修改商品采购状态
     * @param id
     * @return
     */
    Integer updateGoodsPurStatus(String id);

    /**
     * 批量添加订单项
     * @return
     */
    Integer insertOrderItemList(List<OrderItem> orderItemList);

    /**
     * 通过名字查询计量单位
     * @param name
     * @return
     */
    MeasuringUnit selectUnitByName(String name);

}
