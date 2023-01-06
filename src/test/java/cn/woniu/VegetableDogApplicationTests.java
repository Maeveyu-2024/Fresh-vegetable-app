package cn.woniu;

import cn.woniu.dao.manage.WarehouseDao;
import cn.woniu.entity.manage.Warehouse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VegetableDogApplicationTests {

    @Autowired(required = false)
    private WarehouseDao warehouseDao;

    @Test
    void contextLoads() {
        Warehouse warehouse = new Warehouse();
        List<Warehouse> warehouses = warehouseDao.queryWarehouseList(warehouse);
        warehouses.forEach(e->{
            System.out.println(e);
        });

    }

}
