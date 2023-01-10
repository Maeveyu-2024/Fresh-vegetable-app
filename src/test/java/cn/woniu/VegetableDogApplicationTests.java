package cn.woniu;

import cn.woniu.entity.manage.Client;
import cn.woniu.service.manage.ClientService;
import cn.woniu.utils.Md5;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VegetableDogApplicationTests {

    @Autowired
    private ClientService clientService;

    @Test
    void contextLoads() {
        System.out.println(Md5.md5("123"));
    }

}
