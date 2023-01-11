package cn.woniu.service.finance.impl;

import cn.woniu.dao.finance.FinancePayDao;
import cn.woniu.entity.finance.FinancePay;
import cn.woniu.entity.finance.FinanceQuery;
import cn.woniu.entity.material.StandardProducts;
import cn.woniu.service.finance.FinancePayService;
import cn.woniu.utils.ResponseResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


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


    @Override
    public ResponseResult<?> queryFinancePay(FinancePay financePay) {
        PageHelper.startPage(financePay.getPageNo(),financePay.getPageSize());
        List<FinancePay> financePays = financePayDao.queryFinancePay(financePay);
        PageInfo<FinancePay> pageInfo = new PageInfo<>(financePays);
        return new ResponseResult<>().ok(pageInfo);
    }

    @Override
    public ResponseResult<?> updateFinancePayStatus(String id) {
        int count = financePayDao.updateFinancePayStatus(id);
        return new ResponseResult<>().ok(count);
    }

    @Override
    public ResponseResult<?> addFinancePay(StandardProducts standardProducts) {
        int count = financePayDao.addFinancePay(standardProducts);
        return new ResponseResult<>().ok(count);
    }
}

