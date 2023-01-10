package cn.woniu.dao.material;


import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.material.StandardProducts;

import java.util.List;

/**
 * (StandardProducts)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:39:00
 */
public interface StandardProductsDao extends BaseMapper<StandardProducts> {
    List<StandardProducts> query(String id, String goodsName, String warehouse);

}
