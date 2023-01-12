package cn.woniu.service.consumer.impl;

import cn.woniu.dao.consumer.ConsumerAddressDao;
import cn.woniu.entity.manage.Client;
import cn.woniu.service.consumer.ConsumerAddressService;
import cn.woniu.utils.ResponseResult;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;


/**
 * (ConsumerAddress)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@Service
public class ConsumerAddressServiceImpl implements ConsumerAddressService {

    @Autowired(required = false)
    private ConsumerAddressDao consumerAddressDao;

    @Override
    public ResponseResult<?> queryClientAddressByClientId(String id) {
        List<Client> clientList = consumerAddressDao.queryClientAddressByClientId(id);
        clientList.forEach(c -> {
            List<String> values = Arrays.asList(c.getAreaValue().split(" "));
            c.setAreaValues(values);
        });
        return new ResponseResult<>().ok(clientList);
    }
}

