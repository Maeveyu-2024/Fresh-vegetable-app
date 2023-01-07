package cn.woniu;

import cn.woniu.entity.manage.Client;
import cn.woniu.service.manage.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VegetableDogApplicationTests {

    @Autowired
    private ClientService clientService;

    @Test
    void contextLoads() {

    }

}
