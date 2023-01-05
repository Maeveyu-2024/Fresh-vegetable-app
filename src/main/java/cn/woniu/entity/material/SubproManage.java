package cn.woniu.entity.material;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (SubproManage)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubproManage {
    //主键
    private String id;
    //编号
    private String no;
    //订单id
    private String orderId;
    //仓库id
    private String warehouseId;
    //状态
    private Integer status;
    //更新时间
    private LocalDate time;


}

