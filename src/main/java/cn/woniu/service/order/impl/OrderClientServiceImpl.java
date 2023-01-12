package cn.woniu.service.order.impl;

import cn.woniu.dao.manage.MeasuringUnitDao;
import cn.woniu.dao.order.OrderClientDao;
import cn.woniu.dao.order.OrderItemDao;
import cn.woniu.dao.order.OrderSummaryDao;
import cn.woniu.entity.manage.Client;
import cn.woniu.entity.manage.MeasuringUnit;
import cn.woniu.entity.order.OrderClient;
import cn.woniu.entity.order.OrderItem;
import cn.woniu.entity.order.OrderSummary;
import cn.woniu.service.order.OrderClientService;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import java.time.LocalDate;
import java.util.List;


/**
 * (OrderClient)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:59
 */
@Service
public class OrderClientServiceImpl implements OrderClientService {

    @Autowired(required = false)
    private OrderClientDao orderClientDao;
    @Autowired(required = false)
    private OrderSummaryDao orderSummaryDao;
    @Autowired(required = false)
    private MeasuringUnitDao measuringUnitDao;

    @Override
    public ResponseResult<?> queryOrder(OrderClient orderClient, Integer pageNum, Integer pageSize) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", orderClientDao.pageCount(orderClient));
        List<OrderClient> orderClients = orderClientDao.queryAll(orderClient);
        List<OrderClient> orderClientList = orderClients.stream().skip((pageNum - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
        map.put("list", orderClientList);

        return new ResponseResult<>().ok(map);
    }

    @Override
    public ResponseResult<?> deleteOrderByOrderId(String id) {
        OrderClient orderClient = orderClientDao.selectById(id);
        if (orderClient.getStatus() == 3) {
            Integer count = orderClientDao.updateOrderByOrderId(id);
            return new ResponseResult<>().ok(count);
        }
        return ResponseResult.FAILURE;
    }

    @Override
    public ResponseResult<?> updateOrderAddress(String id, String address) {
        Integer count = orderClientDao.updataOrderAddress(id, address);
        if (count > 0) {
            return new ResponseResult<>().ok(count);
        }
        return ResponseResult.FAILURE;
    }

    @Override
    @Transactional
    public ResponseResult<?> updateOrderItem(OrderClient orderClient) {
        orderClientDao.updateOrderMoney(orderClient.getId(), orderClient.getTotalMoney());
        Integer count = orderClientDao.updateOrderItem(orderClient.getOrderItemList(), orderClient.getId());
        return new ResponseResult<>().ok(count);
    }

    @Override
    @Transactional
    public ResponseResult<?> check(OrderSummary orderSummary, Integer purStatus, Double saleNum) {
        orderClientDao.updateOrderStatus(orderSummary.getOrderId());
        if(orderSummary.getDemand() > 0 && purStatus == 0){
            orderClientDao.updateGoodsPurStatus(orderSummary.getGoodsId());
            orderSummaryDao.insert(orderSummary);
        }

        return new ResponseResult<>().ok(null);
    }

    @Override
    public ResponseResult<?> addOrder(OrderClient orderClient) {
        orderClientDao.insert(orderClient);
        QueryWrapper<OrderClient> wrapper = new QueryWrapper<OrderClient>().eq("no", orderClient.getNo());
        String id = orderClientDao.selectOne(wrapper).getId();
        List<OrderItem> itemList = orderClient.getOrderItemList();
        itemList.forEach(item -> {
            item.setOrderId(id);
            MeasuringUnit measuringUnit = orderClientDao.selectUnitByName(item.getUnitName());
            item.setUnit(measuringUnit.getId());
        });
        orderClientDao.insertOrderItemList(itemList);
        return new ResponseResult<>().ok(null);
    }

    @Override
    public ResponseResult<?> updateOrderStatus(String id, Integer status) {
        return null;
    }

    @Override
    public ResponseResult<?> queryAllByChart(String name, List<LocalDate> inductionTime) {
        List<OrderClient> orderClients = orderClientDao.queryAllByChart(name, inductionTime);

        return new ResponseResult<>(200, "查询成功", orderClients);
    }

    @Override
    public ResponseResult<?> queryAllOrderClientName() {
        List<OrderClient> orderClients = orderClientDao.queryAllOrderClientName();
        return new ResponseResult<>(200, "查询成功", orderClients);
    }
}

