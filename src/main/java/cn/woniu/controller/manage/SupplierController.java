package cn.woniu.controller.manage;


import cn.woniu.service.manage.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Supplier)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:39:02
 */
@RestController
@RequestMapping("/supplier")
public class SupplierController {
    /**
     * 服务对象
     */
    @Autowired
    private SupplierService supplierService;
}
