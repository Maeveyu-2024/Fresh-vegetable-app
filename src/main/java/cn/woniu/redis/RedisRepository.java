package cn.woniu.redis;


import cn.woniu.entity.manage.Area;
import org.springframework.data.repository.CrudRepository;

public interface RedisRepository extends CrudRepository<Area,Long> {
}
