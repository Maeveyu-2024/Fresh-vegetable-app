package cn.woniu.entity.manage;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (GoodsType)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsType {

    private String id;
    //商品类别名称
    private String name;
    //父类商品类别id
    private String parentId;
    //状态 0:停用 1:启用
    private Integer status;


}

