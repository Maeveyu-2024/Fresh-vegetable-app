package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.AreaDao;
import cn.woniu.dao.manage.ClientDao;
import cn.woniu.entity.manage.Area;
import cn.woniu.entity.manage.Client;
import cn.woniu.service.manage.AreaService;
import cn.woniu.service.manage.ClientService;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


/**
 * (Client)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired(required = false)
    private ClientDao clientDao;

    @Autowired(required = false)
    private AreaDao areaDao;

    @Autowired
    private AreaService areaService;

    @Override
    public ResponseResult<?> queryClientList(Client client, Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<Client> clientList = clientDao.queryClient(client);
        clientList.forEach(c -> {
            List<String> values = Arrays.asList(c.getAreaValue().split(" "));
            c.setAreaValues(values);
        });
        PageInfo<Client> pageInfo = new PageInfo<>(clientList);
        return new ResponseResult<>().ok(pageInfo);
    }

    @Override
    public ResponseResult<?> addClient(Client client) {
        Area area = clientDao.queryAreaByAreaName(client.getAreaName());
        if (area != null){
            client.setAreaId(area.getId());
        }else {
            Area a = new Area();
            a.setName(client.getAreaName());
            a.setAreaValues(client.getAreaValues());
            areaService.addArea(a);
            client.setAreaId(clientDao.queryAreaByAreaName(client.getAreaName()).getId());
        }
        client.setStatus(1);
        client.setClientId(null);
        client.setUpdateTime(LocalDate.now());
        int count = clientDao.insert(client);
        if (count > 0) {
            return new ResponseResult<>().ok(count);
        }
        return ResponseResult.FAILURE;
    }

    @Override
    public ResponseResult<?> updateClient(Client client) {
        Area area = clientDao.queryAreaByAreaName(client.getAreaName());
        if (area != null){
            client.setAreaId(area.getId());
        }else {
            Area a = new Area();
            a.setName(client.getAreaName());
            a.setAreaValues(client.getAreaValues());
            areaService.addArea(a);
            client.setAreaId(clientDao.queryAreaByAreaName(client.getAreaName()).getId());
        }
        client.setUpdateTime(LocalDate.now());
        int count = clientDao.updateById(client);
        if (count > 0) {
            return new ResponseResult<>().ok(count);
        }
        return ResponseResult.FAILURE;
    }

    @Override
    public ResponseResult<?> updateStatus(String clientId, Integer status) {
        Client client = clientDao.selectById(clientId);
        client.setStatus(status);
        int count = clientDao.updateById(client);
        if (count > 0) {
            return new ResponseResult<>().ok(count);
        }
        return ResponseResult.FAILURE;
    }

    @Override
    public ResponseResult<?> updateBatchStatus(List<String> clientIds, Integer status) {
        if (clientIds != null && clientIds.size() > 0) {
            Integer count = clientDao.updateBatchStatus(clientIds, status);
            if (count > 0) {
                return new ResponseResult<>().ok(count);
            }
        }
        return ResponseResult.FAILURE;
    }

}

