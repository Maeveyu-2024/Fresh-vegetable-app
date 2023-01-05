package cn.woniu.filter;

import cn.woniu.service.SecurityLoginServiceImpl;
import cn.woniu.utils.JWTUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Component
public class JWTFilter extends OncePerRequestFilter {
    @Autowired
    private SecurityLoginServiceImpl securityLoginService;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @SneakyThrows
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest,
                                    HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        //如果Spring Security中没有Authentication Token,这个请求就需要被JwtFilter管理，
        if (authentication != null) {
            //Security Context 中已有 Authentication Token说明是登录请求
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }

        //请求中没有token信息，不用向Spring Security的上下文中保存Authentication Token
        //获得请求中的token信息,jwtToken为请求头中携带的token名称
        String jwt = httpServletRequest.getHeader("jwt");
        if (StringUtils.isBlank(jwt)) {
            //请求中没有token
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }

        //请求中有token信息，但是token非法，不用向Spring Security的上下文中保存Authentication Token
        if (!JWTUtil.decode(jwt)) {
            //有token，但非法
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }

        //请求中有token信息，且token合法,就从请求中获取携带的token，
        // 然后转为Spring Security的Authentication Token(需要带有用户所有的权限),保存在Spring Security上下文中
        //获得token中的userName
        Map<String, Object> payload = JWTUtil.getPayload(jwt);
        String userName = (String) payload.get("userName");

        //判断redis中有无jwt
        String jwtToken = redisTemplate.opsForValue().get("jwt:" + userName);
        if (StringUtils.isBlank(jwtToken)) {
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }

        //判断是不是同一个token
        if (jwt.equals(jwtToken)) {
            //续期
            redisTemplate.opsForValue().set("jwt:" + userName, jwtToken, 30, TimeUnit.MINUTES);
        }

        //调用登录查询方法，获得Spring Security的UserDetails认证对象
        UserDetails userDetails = securityLoginService.loadUserByUsername(userName);

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        //放行到下一个过滤器
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
