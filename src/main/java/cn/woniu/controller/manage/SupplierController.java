package cn.woniu.controller.manage;


import cn.woniu.entity.manage.Supplier;
import cn.woniu.service.manage.SupplierService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

    /**
     * 条件查询供应商列表
     *
     * @param name
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/list")
    public ResponseResult querySupplierAll(String name, Integer pageNo, Integer pageSize) {
        return supplierService.querySupplierAllByName(name, pageNo, pageSize);
    }

    /**
     * 供应商新增
     *
     * @param supplier
     * @return
     */
    @PostMapping("/add")
    public ResponseResult SupplierAdd(Supplier supplier) {
        return supplierService.SupplierAdd(supplier);
    }

    /**
     * 供应商修改
     *
     * @param supplier
     * @return
     */
    @PostMapping("/update")
    public ResponseResult SupplierUpdate(Supplier supplier) {
        return supplierService.SupplierUpdate(supplier);
    }

    /**
     * 供应商冻结/解冻/逻辑删除
     *
     * @param id
     * @param operate
     * @return
     */
    @RequestMapping("/status_update")
    public ResponseResult SupplierStatusUpdate(String id, Integer operate) {
        return supplierService.SupplierStatusUpdate(id, operate);
    }
}
