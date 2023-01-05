package cn.woniu.entity.manage;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (Client)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private String id;
    //客户名
    private String clientName;
    //地址
    private String address;
    //联系人
    private String contactPerson;
    //联系电话
    private String contactTel;
    //区域id
    private String areaId;
    //更新时间
    private LocalDate updateTime;
    //个人描述
    private String description;
    //状态 0:停用 1:启用
    private Integer status;
    //客户id
    private Integer clientId;


}

