package cn.woniu.entity.order;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (OrderItem)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    //订单项表
    private String id;
    //订单id order_client表主键
    private String orderId;
    //商品id goods表主键
    private String goodsId;
    //订单项商品数量
    private Double num;
    //订单项总额
    private Double price;
    //订单项单位
    private Integer unit;
    //状态
    private String status;
    //商品名称
    @TableField(exist = false)
    private String goodsName;
    //商品单价
    @TableField(exist = false)
    private Double goodsPrice;
    //商品单价
    @TableField(exist = false)
    private String unitName;

}

