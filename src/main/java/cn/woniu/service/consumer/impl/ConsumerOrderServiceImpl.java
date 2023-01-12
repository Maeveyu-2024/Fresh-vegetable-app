package cn.woniu.service.consumer.impl;

import cn.woniu.dao.consumer.ConsumerOrderDao;
import cn.woniu.dao.order.OrderClientDao;
import cn.woniu.entity.order.OrderClient;
import cn.woniu.service.consumer.ConsumerOrderService;
import cn.woniu.utils.ResponseResult;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


/**
 * (ConsumerOrder)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@Service
public class ConsumerOrderServiceImpl implements ConsumerOrderService {

    @Autowired(required = false)
    private ConsumerOrderDao consumerOrderDao;
    @Autowired(required = false)
    private OrderClientDao orderClientDao;

    @Override
    public ResponseResult<?> queryOrderAll(OrderClient orderClient, Integer pageNum, Integer pageSize) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", orderClientDao.pageCount(orderClient));
        List<OrderClient> orderClients = consumerOrderDao.queryOrderAll(orderClient);
        List<OrderClient> orderClientList = orderClients.stream().skip((pageNum - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
        map.put("list", orderClientList);
        return new ResponseResult<>().ok(map);
    }
}

