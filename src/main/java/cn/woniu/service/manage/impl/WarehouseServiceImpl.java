package cn.woniu.service.manage.impl;

import cn.woniu.dao.manage.WarehouseDao;
import cn.woniu.entity.manage.Employee;
import cn.woniu.entity.manage.Warehouse;
import cn.woniu.service.manage.WarehouseService;
import cn.woniu.utils.ResponseResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;


/**
 * (Warehouse)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:39:03
 */
@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired(required = false)
    private WarehouseDao warehouseDao;

    @Override
    public ResponseResult<?> queryWarehouseList(Warehouse warehouse) {
        PageHelper.startPage(warehouse.getPageNo(),warehouse.getPageSize());
        List<Warehouse> warehouses = warehouseDao.queryWarehouseList(warehouse);
        PageInfo<Warehouse> pageInfo = new PageInfo<>(warehouses);
        return new ResponseResult<>().ok(pageInfo);

    }

    @Override
    public ResponseResult<?> addWarehouse(Warehouse warehouse) {
        int count = warehouseDao.insert(warehouse);
        return new ResponseResult<>().ok(count);
    }

    @Override
    public ResponseResult<?> updateWarehouse(Warehouse warehouse) {
        int count = warehouseDao.updateById(warehouse);
        return new ResponseResult<>().ok(count);

    }

    @Override
    public ResponseResult<?> deleteWarehouse(String id,Integer status) {
        int count = warehouseDao.updateWarehouseStatusById(id,status);
        return new ResponseResult<>().ok(count);
    }

    @Override
    public ResponseResult<?> updateWarehouseStatus(String id, Integer status) {
        int count = warehouseDao.updateWarehouseStatusById(id, status);
        return new ResponseResult<>().ok(count);
    }

    @Override
    public ResponseResult<?> queryEmployeeList() {
        List<Employee> employeeList = warehouseDao.queryEmployeeList();
        return new ResponseResult<>().ok(employeeList);
    }
}

