package cn.woniu.entity.manage;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * (Supplier)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:39:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Supplier {
    //供应商表
    @TableId(type = IdType.AUTO)
    private String id;
    //供应商公司
    private String company;
    //供应商联系人
    private String contactPerson;
    //供应商联系人电话
    private String concatTel;
    //区域id
    private String areaId;
    //详细地址
    private String address;
    //描述
    private String description;
    //更新时间
    private LocalDate updateTime;
    //状态 0:冻结 1:正常
    private Integer status;
    @TableField(exist = false)
    private String areaName;
    @TableField(exist = false)
    private String areaValue;
    @TableField(exist = false)
    private List<String> areaValues;
}

