package cn.woniu.entity.material;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (ProductSend)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductSend {
    //主键
    private String id;
    //出库单编号
    private String no;
    //订单 id
    private String orderId;
    //状态
    private Integer status;
    //是否删除字段
    private String deleted;
    //时间
    private LocalDate time;


}

