package cn.woniu.entity.order;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (OrderSummary)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderSummary {
    //采购清单表
    private String id;
    //商品id
    private String goodsId;
    //订单汇总需求量
    private Double demand;
    //状态
    private String status;
    //订单项价格
    private Double price;
    //订单项id
    private String orderId;
    //商品成品or次品
    private String type;
    //商品名称
    private String goodsName;
    //商品单位id
    private String unit;


}

