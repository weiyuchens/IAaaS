package com.gbtech.iaaas.config;

import com.gbtech.iaaas.component.JwtAuthenticationTokenFilter;
import com.gbtech.iaaas.component.RestAuthenticationEntryPoint;
import com.gbtech.iaaas.component.RestfulAccessDeniedHandler;
import com.gbtech.iaaas.dto.StaffUserDetail;
import com.gbtech.iaaas.mbg.model.AeStaff;
import com.gbtech.iaaas.mbg.model.AeStaffPermission;
import com.gbtech.iaaas.service.StaffService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private StaffService staffService;

    @Autowired
    private RestfulAccessDeniedHandler restfulAccessDeniedHandler;

    @Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

    private static final Logger logger = LoggerFactory.getLogger(SpringSecurityConfig.class);

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()  // ??????????????????JWT????????????????????????csrf
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, // ????????????????????????????????????????????????
                        "/",
                        "/*.html",
                        "/favicon.ico",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js",
                        "/swagger-resources/**",
                        "/v2/api-docs/**").permitAll()
                .antMatchers("/manage/staff/login", "/manage/staff/register")
                .permitAll() // ???????????????????????????????????????
                .antMatchers(HttpMethod.OPTIONS).permitAll() // ???????????????????????????????????????options??????
                .anyRequest().authenticated(); // ???????????????????????????????????????????????????
        // ????????????
        httpSecurity.headers().cacheControl();
        // ??????JWT filter
        httpSecurity.addFilterBefore(jwtAuthenticationTokenFilter(),
                UsernamePasswordAuthenticationFilter.class);
        // ????????????????????????????????????????????????
        httpSecurity.exceptionHandling().accessDeniedHandler(restfulAccessDeniedHandler)
                .authenticationEntryPoint(restAuthenticationEntryPoint);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService())
                .passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // ????????????????????????
        return username -> {
            AeStaff staff = staffService.getStaffByUsername(username);
            if (staff != null) {
                logger.info("????????????????????????????????????????????????: {}", staff.toString());
                List<AeStaffPermission> permissionList = staffService.getStaffPermissionList(
                        staff.getId());
                logger.info("????????????????????????: {}", permissionList.toString());
                return new StaffUserDetail(staff, permissionList);
            }
            throw new UsernameNotFoundException("????????????????????????");
        };
    }

    @Bean
    public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() {
        return new JwtAuthenticationTokenFilter();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

}
