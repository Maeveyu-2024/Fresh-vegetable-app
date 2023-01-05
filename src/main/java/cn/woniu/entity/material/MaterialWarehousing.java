package cn.woniu.entity.material;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (MaterialWarehousing)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialWarehousing {
    //主键
    private String id;
    //采购清单id
    private String shoppinglistId;
    //原料名称
    private String name;
    //原料编号
    private String no;
    //商品id
    private String goodsId;
    //供应商id
    private String supplierId;
    //雇员id
    private String employeeId;
    //状态
    private Integer status;
    //数量
    private Object num;
    //采购价格
    private Double purchPrice;
    //单位id
    private String unitId;
    //更新时间
    private LocalDate time;
    //仓库id
    private String warehouseId;


}

