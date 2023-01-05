package cn.woniu.config;

import cn.woniu.filter.JWTFilter;
import cn.woniu.handler.*;
import cn.woniu.service.SecurityLoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SecurityLoginServiceImpl securityLoginServiceImpl;

    @Autowired
    private LoginSuccessHandler loginSuccessHandler;

    @Autowired
    private JWTFilter jwtFilter;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityLoginServiceImpl);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .successHandler(loginSuccessHandler)
                .failureHandler(new LoginFailureHandler())
                .permitAll();

        http.exceptionHandling()
                .authenticationEntryPoint(new NoLoginEntryPoint())
                .accessDeniedHandler(new NoAuthorityHandler());

        http.authorizeRequests()
                .anyRequest()
                .authenticated();

        http.addFilterAfter(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        http.logout().logoutSuccessHandler(new LogoutHandler());

        http.csrf().disable();

    }
}
