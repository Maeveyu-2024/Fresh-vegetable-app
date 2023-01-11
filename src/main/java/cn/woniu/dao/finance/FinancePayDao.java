package cn.woniu.dao.finance;


import cn.woniu.entity.material.StandardProducts;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.finance.FinancePay;

import java.util.List;

/**
 * (FinancePay)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
public interface FinancePayDao extends BaseMapper<FinancePay> {
    /**
     * 查询应收款订单
     * @param financePay
     * @return
     */
    List<FinancePay> queryFinancePay(FinancePay financePay);

    /**
     *改变应收款订单状态
     * @param id
     * @return
     */
    int updateFinancePayStatus(String id);

    /**
     * 增加应收款
     * @param standardProducts
     * @return
     */
    int addFinancePay(StandardProducts standardProducts);


}
