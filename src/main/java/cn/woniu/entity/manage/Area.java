package cn.woniu.entity.manage;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Area)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Area {

    private String id;
    //区域名称
    private String name;
    //状态: 0:停用 1:启用
    private Integer status;


}

