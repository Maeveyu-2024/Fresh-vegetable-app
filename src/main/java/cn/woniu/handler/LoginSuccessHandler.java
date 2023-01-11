package cn.woniu.handler;

import cn.woniu.utils.JWTUtil;
import cn.woniu.utils.ResponseResult;
import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired(required = false)
    private RedisTemplate<String, String> redisTemplate;

    @SneakyThrows
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {


        User user = (User) authentication.getPrincipal();
        Map<String, String> map = new HashMap<>();
        map.put("userName", user.getUsername());
        Collection<GrantedAuthority> authorities = user.getAuthorities();
        //创建一个空集合存储所有的权限码
        List<String> authsList = new ArrayList<>();
        authorities.forEach(e -> {
            String authority = e.getAuthority();
            authsList.add(authority);
        });
        Map<String,String> result = new HashMap<>();
        String jwt = JWTUtil.getJWT(map);
        result.put("jwt",jwt);
        String auths = String.join(",", authsList);
        result.put("auths",auths);
        redisTemplate.opsForValue().set("jwt:" + user.getUsername(), jwt, 30, TimeUnit.MINUTES);


        httpServletResponse.setContentType("application/json;charset=UTF-8");
        PrintWriter writer = httpServletResponse.getWriter();
        writer.print(JSON.toJSONString(new ResponseResult().ok(result)));
        writer.flush();
        writer.close();
    }
}
