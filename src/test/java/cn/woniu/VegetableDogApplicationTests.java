package cn.woniu;

<<<<<<< HEAD
import cn.woniu.dao.order.OrderSummaryDao;
=======
import cn.woniu.dao.manage.GoodsDao;
import cn.woniu.dao.manage.GoodsTypeDao;
import cn.woniu.dao.manage.WarehouseDao;
>>>>>>> 609a0f880d1001384d9c2bb78356d4959ae1bc0e
import cn.woniu.entity.manage.Client;
import cn.woniu.entity.manage.Goods;
import cn.woniu.entity.manage.GoodsType;
import cn.woniu.entity.manage.Warehouse;
import cn.woniu.service.manage.ClientService;
import cn.woniu.service.manage.WarehouseService;
import cn.woniu.utils.ResponseResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VegetableDogApplicationTests {
    @Autowired
    private WarehouseService warehouseService;

    @Autowired(required = false)
    private WarehouseDao warehouseDao;

    @Autowired(required = false)
    private GoodsDao goodsDao;

    @Autowired(required = false)
    private GoodsTypeDao goodsTypeDao;

    @Autowired
    private ClientService clientService;
    @Autowired(required = false)
    private OrderSummaryDao orderSummaryDao;
    @Test
    void contextLoads() {
<<<<<<< HEAD
=======
        Warehouse warehouse = new Warehouse("1", null, null, null, null, null, null, null, null);
        List<Warehouse> warehouses = warehouseDao.queryWarehouseList(warehouse);
        warehouses.forEach(e->{
            System.out.println(e);
        });

    }

//    @Test
//    void contextLoads1() {
//        Goods goods = new Goods(null, "广", "c", null, null, null, null, null, null, null, null, null, null, 40.0, 19, null, null, null, "新鲜水果", "斤", "北京颐景园种植专业合作社");
//        List<Goods> goodsList = goodsDao.queryGoodsList(goods);
//        goodsList.forEach(e->{
//            System.out.println(e);
//        });
//
//    }

    @Test
    void contextLoads2() {
        List<GoodsType> departments = goodsTypeDao.selectList(null);
        departments.forEach(e->{
            System.out.println(e);
        });

>>>>>>> 609a0f880d1001384d9c2bb78356d4959ae1bc0e
    }

}
