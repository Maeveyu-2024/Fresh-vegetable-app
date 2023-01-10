package cn.woniu.entity.manage;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (Warehouse)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:39:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {

    private String id;
    //仓库名
    private String name;
    //状态 0:停用 1:启用 2:删除
    private Integer status;
    //详细地址
    private String address;
    //更新时间
    private LocalDate updateTime;
    //员工id
    private String employeeId;
    //员工姓名
    @TableField(exist = false)
    private String employeeName;
    //分页用
    @TableField(exist = false)
    private Integer pageNo;
    @TableField(exist = false)
    private Integer pageSize;


}

