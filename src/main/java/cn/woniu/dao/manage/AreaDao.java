package cn.woniu.dao.manage;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.manage.Area;

import java.util.List;

/**
 * (Area)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
public interface AreaDao{
    List<Area> queryAreaList(String name);//查询area表数据
    void addArea(Area area);//添加area表数据
    void updateArea(Area area);//修改area表数据
    void delArea(Long id);//逻辑删除area表数据
    void stopStatus(Long id);//停用area表数据
    void batchDelArea(List<Integer> ids);//批量删除area表数据

}
