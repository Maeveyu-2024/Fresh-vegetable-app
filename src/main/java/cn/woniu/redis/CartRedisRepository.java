package cn.woniu.redis;

import cn.woniu.entity.consumer.ConsumerCart;
import org.springframework.data.repository.CrudRepository;

public interface CartRedisRepository extends CrudRepository<ConsumerCart, String> {

    Iterable<ConsumerCart> findByAccount(String account);

}
