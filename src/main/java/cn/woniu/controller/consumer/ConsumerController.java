package cn.woniu.controller.consumer;


import cn.woniu.entity.consumer.Consumer;
import cn.woniu.service.consumer.ConsumerService;
import cn.woniu.utils.Md5;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Consumer)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    /**
     * 服务对象
     */
    @Autowired
    private ConsumerService consumerService;

    /**
     * 查询全部
     *
     * @return
     */
    @RequestMapping("/all")
    public ResponseResult consumerList() {
        return consumerService.QueryAllConsumer();
    }

    @RequestMapping("/login")
    public ResponseResult consumerLogin(String name, String passwd) {
        return consumerService.consumerLogin(name, passwd);
    }

    @PostMapping("/register")
    public ResponseResult consumerRegister(@RequestBody Consumer consumer) {
        return consumerService.consumerRegister(consumer);
    }

    @RequestMapping("/mall")
    public ResponseResult queryGoodInMall(String name, String typeId, Integer pageNo, Integer pageSize) {
        return consumerService.queryAllGoodsInMall(name, typeId, pageNo, pageSize);
    }

    @RequestMapping("/mallgoodtype")
    public ResponseResult queryAllGoodTypeInMall() {
        return consumerService.queryAllGoodTypeInMall();
    }
}
