package com.aaa.sm;

import com.aaa.sm.interceptor.LoginInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * className:MvcConfigClass
 * discription:
 * author:Ryb
 * createTime:2018-11-10 16:44
 */
@SpringBootConfiguration // 标识该类为配置类
public class MvcConfigClass implements WebMvcConfigurer {
    //快捷键 继承 ctrl + o
    //接口 ctrl + i

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加自定义拦截器  配置拦截路径addPathPatterns和不拦截的路径
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/emp/toUpload","/emp/toLogin","/emp/Login");
    }

}
