package cn.woniu.entity.manage;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

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
    private String status;
    //删除: 0:是 1:否
    private Integer del;
    //批量功能id集合
    List<Integer> ids;



}

