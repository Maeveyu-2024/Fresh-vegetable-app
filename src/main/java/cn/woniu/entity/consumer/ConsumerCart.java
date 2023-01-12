package cn.woniu.entity.consumer;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * (ConsumerCart)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerCart {

    private String id;
    @Id
    private String userId;

    private String goodId;

    private String goodNum;

    private Double goodPrice;

    private String goodType;
    @TableField(exist = false)
    private String name;
    @TableField(exist = false)
    private String pic;
    @TableField(exist = false)
    private String unitName;
}

