package cn.woniu.controller.manage;


import cn.woniu.entity.manage.Warehouse;
import cn.woniu.service.manage.WarehouseService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Warehouse)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:03
 */
@RestController
@RequestMapping("/warehouse")
public class WarehouseController {
    /**
     * 服务对象
     */
    @Autowired
    private WarehouseService warehouseService;

    /**
     *查询仓库
     * @param warehouse
     * @return
     */
    @PostMapping("queryWarehouse")
    public ResponseResult<?> queryWarehouse(@RequestBody Warehouse warehouse){
        return warehouseService.queryWarehouseList(warehouse);
    }

    /**
     * 添加仓库
     * @param warehouse
     * @return
     */
    @PostMapping("addWarehouse")
    public ResponseResult<?> addWarehouse(@RequestBody Warehouse warehouse){
        return warehouseService.addWarehouse(warehouse);
    }

    /**
     * 修改仓库
     * @param warehouse
     * @return
     */
    @PostMapping("updateWarehouse")
    public ResponseResult<?> updateWarehouse(@RequestBody Warehouse warehouse){
        return warehouseService.updateWarehouse(warehouse);
    }
}
