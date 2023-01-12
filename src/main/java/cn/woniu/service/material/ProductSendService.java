package cn.woniu.service.material;


import cn.woniu.utils.ResponseResult;

/**
 * (ProductSend)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
public interface ProductSendService {
    ResponseResult<?> updateLimit(Double limit, String id);
}

