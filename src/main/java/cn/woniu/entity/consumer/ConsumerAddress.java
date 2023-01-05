package cn.woniu.entity.consumer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (ConsumerAddress)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerAddress {

    private String id;

    private String userName;

    private String userAddress;

    private String contactPerson;

    private String contactTel;

    private String areaId;

    private LocalDate updateTime;

    private String description;

    private String status;

    private String userId;


}

