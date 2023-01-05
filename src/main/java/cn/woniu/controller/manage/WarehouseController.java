package cn.woniu.controller.manage;


import cn.woniu.service.manage.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
