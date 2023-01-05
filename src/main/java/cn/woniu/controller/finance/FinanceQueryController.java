package cn.woniu.controller.finance;


import cn.woniu.service.finance.FinanceQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (FinanceQuery)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:52
 */
@RestController
@RequestMapping("/financeQuery")
public class FinanceQueryController {
    /**
     * 服务对象
     */
    @Autowired
    private FinanceQueryService financeQueryService;
}
