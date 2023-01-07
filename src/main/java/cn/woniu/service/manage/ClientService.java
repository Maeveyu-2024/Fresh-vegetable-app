package cn.woniu.service.manage;


import cn.woniu.entity.manage.Client;
import cn.woniu.utils.ResponseResult;

import java.util.List;

/**
 * (Client)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
public interface ClientService {
    /**
     * 查询客户
     *
     * @param client
     * @return
     */
    ResponseResult<?> queryClientList(Client client, Integer pageNum, Integer pageSize);

    /**
     * 添加客户
     *
     * @param client
     * @return
     */
    ResponseResult<?> addClient(Client client);

    /**
     * 修改客户
     *
     * @param client
     * @return
     */
    ResponseResult<?> updateClient(Client client);

    /**
     * 修改客户状态,根据客户id
     *
     * @param clientId
     * @return
     */
    ResponseResult<?> updateStatus(String clientId, Integer status);


    /**
     * 批量修改客户状态
     *
     * @param clientIds
     * @return
     */
    ResponseResult<?> updateBatchStatus(List<String> clientIds, Integer status);


}

