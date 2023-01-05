package cn.woniu.handler;

import cn.woniu.utils.JWTUtil;
import cn.woniu.utils.ResponseResult;
import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
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
        String jwt = JWTUtil.getJWT(map);
        redisTemplate.opsForValue().set("jwt:" + user.getUsername(), jwt, 30, TimeUnit.MINUTES);


        httpServletResponse.setContentType("application/json;charset=UTF-8");
        PrintWriter writer = httpServletResponse.getWriter();
        writer.print(JSON.toJSONString(new ResponseResult().ok(jwt)));
        writer.flush();
        writer.close();
    }
}
