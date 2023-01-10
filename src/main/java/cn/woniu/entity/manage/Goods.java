package cn.woniu.entity.manage;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (Goods)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

    private Object id;
    //商品名称
    private String name;
    //单位id
    private String unitId;
    //商品编号
    private String no;
    //损耗率(次品入库自动生成)
    private Object attritionRate;
    //商品类别
    private String goodsTypeId;
    //份量单位
    private String unitWeight;
    //比重
    private Object conver;
    //供应商id
    private String supplierId;
    //图片链接
    private String pic;
    //商品描述
    private String description;
    //商品更新时间
    private LocalDate updateTime;
    //状态  0:停用 1:启用 2:删除
    private Integer status;
    //售价
    private Double salePrice;
    //库存
    private Object stock;
    //库存上限
    private Integer stockUpperLimit;
    //库存下限
    private Integer stockLowerLimit;
    //商品级别类型(成品,次品)
    private String type;
    //连表查询增加字段
    //商品类别
    @TableField(exist = false)
    private String typeName;
    //商品单位
    @TableField(exist = false)
    private String unitName;
    //供应商名称
    @TableField(exist = false)
    private String company;



}

