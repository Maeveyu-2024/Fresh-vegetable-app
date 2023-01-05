package cn.woniu.controller.manage;


import cn.woniu.service.manage.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Client)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
@RestController
@RequestMapping("/client")
public class ClientController {
    /**
     * 服务对象
     */
    @Autowired
    private ClientService clientService;
}
