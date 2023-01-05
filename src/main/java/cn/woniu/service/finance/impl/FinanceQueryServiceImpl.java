package cn.woniu.service.finance.impl;

import cn.woniu.dao.finance.FinanceQueryDao;
import cn.woniu.service.finance.FinanceQueryService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (FinanceQuery)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
@Service
public class FinanceQueryServiceImpl implements FinanceQueryService {

    @Autowired(required = false)
    private FinanceQueryDao financeQueryDao;
}

