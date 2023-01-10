package cn.woniu.entity.finance;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (FinancePay)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinancePay {
    //应收账款表
    private String id;
    //应付款项金额
    private Double payable;
    //类型
    private String type;
    //订单id 订单id order_client主键可能
    private String orderId;
    //状态
    private String status;
    //生成时间
    private LocalDate createTime;
    //成品入库id
    @TableField(exist = false)
    private String standproId;


}

