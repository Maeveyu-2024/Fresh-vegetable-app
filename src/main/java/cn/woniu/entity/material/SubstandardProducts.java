package cn.woniu.entity.material;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (SubstandardProducts)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:39:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubstandardProducts {
    //主键
    private String id;
    //次品编号
    private String no;
    //数量
    private Double num;
    //单位id
    private String unitId;
    //雇员id
    private String employeeId;
    //状态
    private Integer status;
    //对应领料单id(material_get)
    private String getId;
    //耗损率
    private Object attritionRate;
    //仓库id
    private String warehouseId;
    //对应商品id
    private String goodsId;


}

