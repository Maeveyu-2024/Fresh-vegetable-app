package cn.woniu.controller.finance;


import cn.woniu.service.finance.FinancePayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
