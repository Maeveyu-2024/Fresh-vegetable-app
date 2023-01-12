package cn.woniu.dao.consumer;


import cn.woniu.entity.manage.Client;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.consumer.ConsumerAddress;

import java.util.List;

/**
 * (ConsumerAddress)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
public interface ConsumerAddressDao extends BaseMapper<ConsumerAddress> {

    List<Client> queryClientAddressByClientId(String id);

}
