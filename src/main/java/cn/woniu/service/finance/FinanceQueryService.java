package cn.woniu.service.finance;


import cn.woniu.entity.finance.FinanceQuery;
import cn.woniu.utils.ResponseResult;

import java.time.LocalDate;

/**
 * (FinanceQuery)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
public interface FinanceQueryService {

    ResponseResult<?> queryFinance(FinanceQuery financeQuery);

    ResponseResult<?> queryOrder(String id);

    ResponseResult<?> addFinance(Double totalMoney,String id);

    ResponseResult<?> updateFinance(LocalDate payTime, String id);


}

