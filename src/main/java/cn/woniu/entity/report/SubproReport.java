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
public class SubproReport {
    //主键
    private String id;
    //次品入库或次品出库id
    private String recordId;
    //类型(次品出库/次品入库)
    private String type;
    //次品名称
    private String subName;
    //次品数量
    private Object subNum;
    //单位名称
    private String unitName;


}

