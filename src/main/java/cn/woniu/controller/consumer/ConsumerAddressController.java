package cn.woniu.controller.consumer;


import cn.woniu.entity.manage.Client;
import cn.woniu.service.consumer.ConsumerAddressService;
import cn.woniu.service.manage.ClientService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (ConsumerAddress)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:50
 */
@RestController
@RequestMapping("/consumer/consumerAddress")
public class ConsumerAddressController {
    /**
     * 服务对象
     */
    @Autowired
    private ConsumerAddressService consumerAddressService;
    @Autowired
    private ClientService clientService;

    @RequestMapping("/address")
    public ResponseResult<?> queryClientAddressByClientId(String id) {
        return consumerAddressService.queryClientAddressByClientId(id);
    }

    @PostMapping("/add")
    public ResponseResult<?> addressAdd(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @RequestMapping("/del")
    public ResponseResult<?> addressDel(String id) {
        return clientService.updateStatus(id, 2);
    }

    @PostMapping("/update")
    public ResponseResult<?> addressUpdate(@RequestBody Client client) {
        return clientService.updateClient(client);
    }
}
