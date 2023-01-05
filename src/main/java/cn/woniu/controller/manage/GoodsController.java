package cn.woniu.controller.manage;


import cn.woniu.service.manage.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:53
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Autowired
    private GoodsService goodsService;
}
