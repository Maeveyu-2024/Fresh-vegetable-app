package cn.woniu.service.consumer;


import cn.woniu.entity.consumer.ConsumerCart;
import cn.woniu.utils.ResponseResult;

/**
 * (ConsumerCart)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
public interface ConsumerCartService {
    ResponseResult CartAdd(ConsumerCart cart);

    ResponseResult queryCartAll(String userName);

    ResponseResult CartDel(String id);
}

