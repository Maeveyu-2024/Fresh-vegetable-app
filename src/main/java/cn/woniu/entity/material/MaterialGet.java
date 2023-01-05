package cn.woniu.entity.material;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (MaterialGet)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialGet {
    //原材料入库单列表
    private String id;
    //领料数量
    private Double num;
    //单位id
    private String unitId;
    //对应原料单id
    private String rawId;
    //雇员id
    private String employeeId;
    //状态
    private Integer status;
    //仓库id
    private String warehouseId;
    //领料单编号
    private String no;


}

