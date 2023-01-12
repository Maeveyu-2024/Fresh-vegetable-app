package cn.woniu.entity.report;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (SubproReport)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:39:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayReport {
    //图表类的值
    private Float value;
    //图表类的名
    private String name;


}

