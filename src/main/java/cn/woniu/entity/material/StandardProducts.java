package cn.woniu.entity.material;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (StandardProducts)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardProducts {
    //主键
    private String id;
    //领料单id(material_get)
    private String getId;
    //入库单编号
    private String no;
    //数量
    private Double num;
    //区域id
    private String unitId;
    //管理员id
    private String employeeId;
    //状态
    private Integer status;
    //时间
    private LocalDate time;
    //仓库id
    private String warehouseId;
    //是否删除字段
    private Integer deleted;
    //货物id
    private String goodsId;
    @TableField(exist = false)
    private String goodsName;
    @TableField(exist = false)
    private String warehouseAddress;

    private String supplierId;

    private Double price;
    @TableField(exist = false)
    private String unitName;


}

