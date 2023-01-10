package cn.woniu.dao.finance;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.finance.FinanceQuery;

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
     * @param clientName
     * @param receivable
     * @return
     */
    List<FinanceQuery> queryFinance(String clientName,Double receivable);


}
