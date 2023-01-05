package cn.woniu.entity.report;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (MaterialReport)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialReport {
    //主键id
    private Integer id;
    //原料名称
    private String name;
    //价格
    private Double price;
    //数量
    private Double num;
    //单位id
    private String unitId;


}

