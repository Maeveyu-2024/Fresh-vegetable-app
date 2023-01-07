package cn.woniu.controller.manage;


import cn.woniu.entity.manage.Client;
import cn.woniu.service.manage.ClientService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 查询客户
     *
     * @param client   查询条件
     * @param pageNum  当前页数
     * @param pageSize 页面显示条数
     * @return
     */
    @PostMapping("/list")
    public ResponseResult<?> queryClientList(@RequestBody Client client, @RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        return clientService.queryClientList(client, pageNum, pageSize);
    }

    /**
     * 添加客户
     *
     * @param client 客户信息
     * @return
     */
    @PostMapping("/addClient")
    public ResponseResult<?> addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    /**
     * 修改客户
     * @param client 客户信息
     * @return
     */
    @PostMapping("/updateClient")
    ResponseResult<?> updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    /**
     * 修改客户状态/逻辑删除
     * @param clientId
     * @param status
     * @return
     */
    @RequestMapping("/updateStatus")
    public ResponseResult<?> updateStatus(String clientId, Integer status){
        return clientService.updateStatus(clientId, status);
    }
}
