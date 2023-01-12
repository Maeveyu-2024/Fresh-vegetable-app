package cn.woniu.dao.material;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.material.ProductSend;

/**
 * (ProductSend)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
public interface ProductSendDao extends BaseMapper<ProductSend> {

    int updateLimitById(String id,Double limit);
    int updateGoodsLimit(String id,Double limit);
}
