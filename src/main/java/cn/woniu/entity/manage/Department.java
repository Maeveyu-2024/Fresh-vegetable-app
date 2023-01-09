package cn.woniu.entity.manage;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.time.LocalDate;

/**
 * (Department)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("department")
@RequiredArgsConstructor
public class Department {
    @TableId(type= IdType.AUTO)
    private String id;
    //部门名称
    @NonNull
    private String name;
    //更新时间
    @NonNull
    private LocalDate updateTime;
    //状态 0:禁用 1:启用 2:删除
    private Integer status;


}

