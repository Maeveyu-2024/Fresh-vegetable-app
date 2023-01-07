package cn.woniu.dao.manage;


import cn.woniu.entity.manage.Area;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.woniu.entity.manage.Client;

import java.util.List;

/**
 * (Client)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
public interface ClientDao extends BaseMapper<Client> {

    Integer updateBatchStatus(List<String> clientIds, Integer status);

    List<Client> queryClient(Client client);

    Area queryAreaByAreaName(String AreaName);

}
