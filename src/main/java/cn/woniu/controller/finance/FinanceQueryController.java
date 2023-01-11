package cn.woniu.controller.finance;


import cn.woniu.entity.finance.FinanceQuery;
import cn.woniu.entity.manage.Goods;
import cn.woniu.service.finance.FinanceQueryService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

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
    /**
     * 查询应收款订单
     * @param financeQuery
     * @return
     */
    @PostMapping("queryFinance")
    public ResponseResult<?> queryFinance(@RequestBody FinanceQuery financeQuery){
        return financeQueryService.queryFinance(financeQuery);
    }

    /**
     * 查询订单详情
     * @param id
     * @return
     */
    @RequestMapping("queryOrder")
    public ResponseResult<?> queryOrder(String id){
        return financeQueryService.queryOrder(id);
    }

    /**
     * 添加应收款订单
     * 当订单状态为3(订单完成)之后向应收款插入一条应收款订单
     * 传入两个参数即可:
     * totalMoney:订单总金额
     * id:订单id
     * @param totalMoney
     * @param id
     * @return
     */
    @RequestMapping("addFinance")
    public ResponseResult<?> addFinance(Double totalMoney,String id){
        return financeQueryService.addFinance(totalMoney,id);
    }

    /**
     * 修改应收款订单状态和订单时间
     * 当订单付款之后,把订单状态设为1,并且传入订单支付完成时间
     * 传两个参数
     * payTime:订单完成时间
     * id:订单id
     * @param payTime
     * @param id
     * @return
     */
    @RequestMapping("updateFinance")
    public ResponseResult<?> updateFinance(LocalDate payTime, String id){
        return financeQueryService.updateFinance(payTime,id);
    }
}
