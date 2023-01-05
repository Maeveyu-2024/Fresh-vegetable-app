package cn.woniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.woniu.dao")
public class VegetableDogApplication {

    public static void main(String[] args) {
        SpringApplication.run(VegetableDogApplication.class, args);
    }

}
