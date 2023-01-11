package cn.woniu.service.consumer;


import cn.woniu.entity.consumer.Consumer;
import cn.woniu.utils.ResponseResult;

/**
 * (Consumer)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
public interface ConsumerService {
    /**
     * 登陆
     *
     * @param userName
     * @param userPwd
     * @return
     */
    ResponseResult consumerLogin(String userName, String userPwd);

    /**
     * 注册
     *
     * @return
     */
    ResponseResult consumerRegister(Consumer consumer);

    /**
     * 查询全部
     *
     * @return
     */
    ResponseResult QueryAllConsumer();

    /**
     * 查询全部商品
     */
    ResponseResult queryAllGoodsInMall(String name, String typeId, Integer pageNo, Integer pageSize);

    /**
     * 查询所有商品类型
     */
    ResponseResult queryAllGoodTypeInMall();
}

