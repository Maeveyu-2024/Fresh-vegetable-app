package cn.woniu.entity.report;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (ProductReport)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductReport {
    //主键
    private String id;
    //成品库存id
    private String proId;
    //类型
    private String type;
    //成品名称
    private String proName;
    //成品数量
    private Double proNum;
    //单位名称
    private String unitName;
    //成品单价
    private Double price;


}

