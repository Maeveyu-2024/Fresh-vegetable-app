package cn.woniu.dao.consumer;


import cn.woniu.entity.manage.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.consumer.Consumer;

import java.util.List;

/**
 * (Consumer)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
public interface ConsumerDao extends BaseMapper<Consumer> {

    List<Goods> queryAllGoodsInMall(String name, String typeId);

}
