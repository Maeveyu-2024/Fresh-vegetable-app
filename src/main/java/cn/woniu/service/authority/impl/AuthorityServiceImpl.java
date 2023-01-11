package cn.woniu.service.authority.impl;

import cn.woniu.dao.authority.AuthorityDao;
import cn.woniu.dao.manage.EmployeeDao;
import cn.woniu.entity.authority.Authority;
import cn.woniu.entity.manage.Employee;
import cn.woniu.entity.manage.GoodsType;
import cn.woniu.service.authority.AuthorityService;
import cn.woniu.utils.ResponseResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


/**
 * (Authority)表服务实现类
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired(required = false)
    private AuthorityDao authorityDao;
    @Autowired(required = false)
    private EmployeeDao employeeDao;

    @Override
    public ResponseResult<?> queryAuthorityList(String username) {
        List<Authority> authorities = authorityDao.selectAuthorityList(username);
        List<Authority> parentAuth = authorities.stream().filter(e -> e.getParentId() == null).collect(Collectors.toList());
        parentAuth.forEach(e->{
            List<Authority> children = new ArrayList<>();
            authorities.forEach(child ->{
                if(e.getId().equals(child.getParentId())){
                    children.add(child);
                }
                e.setChildren(children);
            });
        });
        return new ResponseResult<>().ok(parentAuth);
    }

    /**
     * 查询某个用户的三级权限列表
     * @return
     */
    public List<Authority> selectAllAuthority(List<Authority> authorities){
        //所有一级权限
        List<Authority> parentAuth = authorities.stream().filter(e -> e.getParentId() == null).collect(Collectors.toList());
        //所有的三级权限
        List<Authority> lastAuth = authorities.stream().filter(e -> e.getType()==2).collect(Collectors.toList());
        //给一级权限添加二级权限
        parentAuth.forEach(e->{
            //创建一个空集合用于存放二级权限
            List<Authority> twoChildren = new ArrayList<>();
            //遍历整个权限表,找出该一级权限对应的二级权限,添加到二级权限集合
            authorities.forEach(twoChild ->{
                if(e.getId().equals(twoChild.getParentId())){
                    //创建一个空集合用于存放三级权限
                    List<Authority> lastChildren = new ArrayList<>();
                    lastAuth.forEach( last ->{
                        if(twoChild.getId().equals(last.getParentId())){
                            lastChildren.add(last);
                        }
                        //给二级权限设置对应的子权限
                        twoChild.setChildren(lastChildren);
                    });
                    //把所有的二级权限添加到空集合
                    twoChildren.add(twoChild);
                }
                //一级权限设置子权限
                e.setChildren(twoChildren);
            });
        });
        return parentAuth;
    }
    @Override
    public ResponseResult<?> queryAllAuthority() {
        List<Employee> employees = authorityDao.selectAllEmployeeAuth();
        employees.forEach(e->{
            List<Authority> authorities = authorityDao.selectAuthorityList(e.getUsername());
            List<Authority> parentAuth = selectAllAuthority(authorities);
            e.setChildren(parentAuth);
        });
        return new ResponseResult<>().ok(employees);
    }

    @Override
    public ResponseResult<?> selectAllAuthority() {
        List<Authority> authorities = authorityDao.selectAllAuthorityList();
        List<Authority> parentAuth = selectAllAuthority(authorities);
        return new ResponseResult<>().ok(parentAuth);
    }

    @Override
    public ResponseResult<?> updateAuthByUid(List<Integer> ids, Integer id) {
        authorityDao.deleteAllByUid(id);
        int count = authorityDao.insertAuthByIdsAndUid(ids, id);
        return new ResponseResult<>().ok(count);
    }

    @Override
    public ResponseResult<?> selectAuthCodeByAids(List<Integer> ids) {
        List<String> authCodeByAids = authorityDao.selectAuthCodeByAids(ids);
        List<String> auths = authCodeByAids.stream().filter(Objects::nonNull).collect(Collectors.toList());
        return new ResponseResult<>().ok(auths);
    }
}

