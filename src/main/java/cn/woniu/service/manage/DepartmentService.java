package cn.woniu.service.manage;


import cn.woniu.utils.ResponseResult;

/**
 * (Department)表服务接口
 *
 * @author makejava
 * @since 2023-01-05 11:38:51
 */
public interface DepartmentService {
    ResponseResult<?> queryDeptList(int pageNum, int pageSize);
    ResponseResult<?> updateDeptStatus(Integer id, Integer status);
    ResponseResult<?> queryDeptName(String name);
    ResponseResult<?> addDept(String name);
    ResponseResult<?> updateDeptInfo(String id, String name);
}

