package cn.woniu.entity.consumer;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * (ConsumerOrder)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerOrder {

    private String id;

    private String orderNo;

    private String clientId;

    private LocalDateTime orderTime;

    private String clientAddress;

    private Object totalMoney;

    private String status;

    private LocalDateTime payTime;

    private LocalDateTime receiveTime;

    private LocalDateTime finishTime;

    private LocalDateTime updateTime;


}

