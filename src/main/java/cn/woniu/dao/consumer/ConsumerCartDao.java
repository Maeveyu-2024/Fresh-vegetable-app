package cn.woniu.dao.consumer;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.consumer.ConsumerCart;

import java.util.List;

/**
 * (ConsumerCart)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
public interface ConsumerCartDao extends BaseMapper<ConsumerCart> {

    List<ConsumerCart> queryAllCart(String userName);

}
