package cn.woniu.service.finance.impl;

import cn.woniu.dao.finance.FinancePayDao;
import cn.woniu.service.finance.FinancePayService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (FinancePay)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
@Service
public class FinancePayServiceImpl implements FinancePayService {

    @Autowired(required = false)
    private FinancePayDao financePayDao;
}

