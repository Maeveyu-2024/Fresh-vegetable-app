package cn.woniu.entity.finance;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (FinanceQuery)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinanceQuery {
    //应收款查看详情
    private String id;
    //发货单id product_send主键可能
    private String sendId;
    //成次品类别
    private String type;
    //状态(是否收款
    private String status;
    //应收款金额
    private Double receivable;
    //收款时间
    private LocalDate recTime;
    //订单表id
    @TableField(exist = false)
    private String orderId;
    //订单编号
    @TableField(exist = false)
    private String NO;
    //订单状态:
    // 0:未审核,1:已审核,2:退货中,3:完成,4:删除
    @TableField(exist = false)
    private Integer ocStatus;


}

