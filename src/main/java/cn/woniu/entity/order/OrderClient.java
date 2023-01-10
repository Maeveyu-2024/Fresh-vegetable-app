package cn.woniu.entity.order;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * (OrderClient)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderClient {
    //订单表
    private String id;
    //订单编号
    private String no;
    //客户id client表主键
    private String clientId;
    //下单时间
    private LocalDate orderTime;
    //详细地址
    private String address;
    //订单总金额
    private Double totalMoney;
    //订单状态
    private Integer status;
    //付款时间
    private LocalDate payTime;
    //退货时间
    private LocalDate receiveTime;
    //完成时间
    private LocalDate finishTime;
    //更新时间
    private LocalDate updateTime;
    //订单项表
    @TableField(exist = false)
    private List<OrderItem> orderItemList;
    //客户姓名
    @TableField(exist = false)
    private String clientName;
    //下单时间区间
    @TableField(exist = false)
    private List<LocalDate> selectTime;


}

