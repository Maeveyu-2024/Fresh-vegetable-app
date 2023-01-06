package cn.woniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@MapperScan("cn.woniu.dao")
@EnableRedisRepositories(basePackages = {"cn.woniu.redis"})
public class VegetableDogApplication {

    public static void main(String[] args) {
        SpringApplication.run(VegetableDogApplication.class, args);
    }

}
