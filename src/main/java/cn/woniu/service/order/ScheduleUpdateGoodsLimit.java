package cn.woniu.service.order;

import cn.woniu.dao.order.OrderClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ScheduleUpdateGoodsLimit {

    @Autowired(required = false)
    private OrderClientDao orderClientDao;


    @Scheduled(cron = "0 0 8 3/3 * ? ")
    public void updateGoodsLimit() {
        orderClientDao.updateGoodsLimit();
    }
}
