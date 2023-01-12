package cn.woniu.entity.material;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (ProductSend)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductSend {
    //主键
    private String id;
    //商品id
    private String goodsId;
    //订单 id
    private String goodsName;
    //状态
    private Double num;
    //是否删除字段
    private Double limit;



}

