package cn.woniu.service;

import cn.woniu.dao.manage.EmployeeDao;
import cn.woniu.entity.manage.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SecurityLoginServiceImpl implements UserDetailsService {

    @Autowired(required = false)
    private PasswordEncoder passwordEncoder;

    @Autowired(required = false)
    private EmployeeDao employeeDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee employee = employeeDao.queryEmployeeByUsername(username);
        if(employee != null){
            String auths = String.join(",", employee.getAuths());
            return new User(employee.getUsername(), passwordEncoder.encode(employee.getPassword()), AuthorityUtils.commaSeparatedStringToAuthorityList(auths));
        }else {
            throw new UsernameNotFoundException("该账号不存在");
        }
    }
}
