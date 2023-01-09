package cn.woniu.controller.manage;


import cn.woniu.service.manage.DepartmentService;
import cn.woniu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Department)表控制层
 *
 * @author makejava
 * @since 2023-01-05 11:38:51
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {
    /**
     * 服务对象
     */
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping("list")
    public ResponseResult<?> queryDeptList(int pageNum, int pageSize){
        return departmentService.queryDeptList(pageNum, pageSize);
    }
    @RequestMapping("ableList")
    public ResponseResult<?> queryDeptListAble(){
        return departmentService.queryDeptListAble();
    }
    @RequestMapping("status")
    public ResponseResult<?> updateDeptStatus(Integer id, Integer status){
        return departmentService.updateDeptStatus(id,status);
    }
    @RequestMapping("name")
    public ResponseResult<?> queryDeptName(String name){
        return departmentService.queryDeptName(name);
    }
    @RequestMapping("add")
    public ResponseResult<?> addDept(String name){
        return departmentService.addDept(name);
    }
    @RequestMapping("update")
    public ResponseResult<?> updateDeptInfo(String id, String name){
        return departmentService.updateDeptInfo(id,name);
    }
}
