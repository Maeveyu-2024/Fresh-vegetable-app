package cn.woniu.entity.order;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (OrderShoppinglist)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderShoppinglist {
    //订单汇总表
    private String id;
    //商品id  goods表主键
    private String goodsId;
    //状态
    private String status;
    //采购数量
    private Double sum;
    //采购计划时间
    private LocalDate purTime;
    //订单项id order_client表主键可能
    private Integer orderId;
    //采购清单编号
    private String no;


}

