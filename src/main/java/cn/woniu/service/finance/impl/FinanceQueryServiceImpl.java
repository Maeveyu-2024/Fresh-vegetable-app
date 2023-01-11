package cn.woniu.service.finance.impl;

import cn.woniu.dao.finance.FinanceQueryDao;
import cn.woniu.entity.finance.FinanceQuery;
import cn.woniu.entity.manage.Goods;
import cn.woniu.service.finance.FinanceQueryService;
import cn.woniu.utils.ResponseResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;


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

    @Override
    public ResponseResult<?> queryFinance(FinanceQuery financeQuery) {
        PageHelper.startPage(financeQuery.getPageNo(),financeQuery.getPageSize());
        List<FinanceQuery> financeQueries = financeQueryDao.queryFinance(financeQuery);
        PageInfo<FinanceQuery> pageInfo = new PageInfo<>(financeQueries);
        return new ResponseResult<>().ok(pageInfo);
    }

    @Override
    public ResponseResult<?> queryOrder(String id) {
        List<FinanceQuery> financeQueries = financeQueryDao.queryOrder(id);
        return new ResponseResult<>().ok(financeQueries);
    }

    @Override
    public ResponseResult<?> addFinance(Double totalMoney, String id) {
        int count = financeQueryDao.addFinance(totalMoney, id);
        return new ResponseResult<>().ok(count);
    }

    @Override
    public ResponseResult<?> updateFinance(LocalDate payTime, String id) {
        int count = financeQueryDao.updateFinance(payTime, id);
        return new ResponseResult<>().ok(count);
    }
}

