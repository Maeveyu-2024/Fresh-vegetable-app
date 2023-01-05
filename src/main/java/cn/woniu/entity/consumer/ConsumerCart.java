package cn.woniu.entity.consumer;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private String userId;

    private String goodId;

    private String goodNum;

    private Double goodPrice;

    private String goodType;


}

