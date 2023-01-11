package cn.woniu.service.finance;


import cn.woniu.entity.finance.FinancePay;
import cn.woniu.entity.finance.FinanceQuery;
import cn.woniu.entity.material.StandardProducts;
import cn.woniu.utils.ResponseResult;

import java.time.LocalDate;

/**
 * (FinancePay)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
public interface FinancePayService {

    /**
     * 查询应收款订单
     * @param financePay
     * @return
     */
    ResponseResult<?> queryFinancePay(FinancePay financePay);

    /**
     * 改变应收款金额订单状态
     * @param id
     * @return
     */
    ResponseResult<?> updateFinancePayStatus(String id);

    /**
     * 增加一条应收款
     * @param standardProducts
     * @return
     */
   ResponseResult<?> addFinancePay(StandardProducts standardProducts);
}

