package cn.woniu.controller.finance;


import cn.woniu.entity.finance.FinancePay;
import cn.woniu.entity.finance.FinanceQuery;
import cn.woniu.entity.material.StandardProducts;
import cn.woniu.service.finance.FinancePayService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * (FinancePay)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
@RestController
@RequestMapping("/financePay")
public class FinancePayController {
    /**
     * 服务对象
     */
    @Autowired
    private FinancePayService financePayService;

    /**
     * 查看应收款订单
     * @param financePay
     * @return
     */
    @PostMapping("queryFinancePay")
    public ResponseResult<?> queryFinancePay(@RequestBody FinancePay financePay){
        return financePayService.queryFinancePay(financePay);
    }

    /**
     * 逻辑删除应收款订单
     * @param id
     * @return
     */
    @RequestMapping("updateFinancePayStatus")
    public ResponseResult<?> updateFinancePayStatus(String id){
        return financePayService.updateFinancePayStatus(id);
    }

    /**
     * 成品入库审核之后,在应收款加一条
     * 传入一个StandardProducts实体
     * @param standardProducts
     * @return
     */
    @PostMapping("addFinancePay")
    public ResponseResult<?> addFinancePay(@RequestBody StandardProducts standardProducts){
        return financePayService.addFinancePay(standardProducts);
    }


}
