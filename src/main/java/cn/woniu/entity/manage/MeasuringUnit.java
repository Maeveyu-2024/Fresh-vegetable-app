package cn.woniu.entity.manage;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (MeasuringUnit)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeasuringUnit {

    private String id;
    //计量单位名称
    private String name;
    //状态 0:停用 1:启用
    private Integer status;
    //重量
    private Object weight;
    //是否删除:0:删除,1:未删除
    private String del;


}

