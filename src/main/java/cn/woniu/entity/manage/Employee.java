package cn.woniu.entity.manage;


import cn.woniu.entity.authority.Authority;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * (Employee)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @TableId
    private Long id;
    //员工姓名
    private String name;
    //员工账号
    private String username;
    //员工密码
    private String password;
    //状态 0:离职 1:在职 2:删除 3:锁定
    private Integer status;
    //更新时间
    private LocalDate updateTime;
    //部门id
    private Long departmentId;
    //工龄
    private Integer workage;
    //年龄
    private Integer age;
    //入职时间
    private LocalDate inductionTime;
    //离职时间
    private LocalDate resignTime;
    //薪水
    private Double salary;
    //生日
    private LocalDate birthday;
    //性别 0:男 1:女
    private Integer gender;
    //权限
    @TableField(exist = false)
    private List<String> auths;
    @TableField(exist = false)
    private List<Authority> children;
    //搜索用
    @TableField(exist = false)
    private LocalDate[] selectInductionTime;
    //列表展示用
    @TableField(exist = false)
    private String departmentName;


}

