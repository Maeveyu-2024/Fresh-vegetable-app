package cn.woniu.dao.finance;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.finance.FinanceQuery;

import java.time.LocalDate;
import java.util.List;

/**
 * (FinanceQuery)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
public interface FinanceQueryDao extends BaseMapper<FinanceQuery> {
    /**
     * 查询应收款金额根据付款方名称和应收款金额
     * @return
     */
    List<FinanceQuery> queryFinance(FinanceQuery financeQuery);

    /**
     * 查询订单详情
     * @param id
     * @return
     */
    List<FinanceQuery>queryOrder(String id);

    /**
     * 加入应收款订单
     * @param totalMoney
     * @param id
     * @return
     */
    int addFinance(Double totalMoney,String id);

    /**
     * 改变订单状态,付款时间
     * @param payTime
     * @param id
     * @return
     */
    int updateFinance(LocalDate payTime,String id);


}
