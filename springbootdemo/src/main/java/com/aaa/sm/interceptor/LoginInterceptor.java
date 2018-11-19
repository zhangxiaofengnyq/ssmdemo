package com.aaa.sm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * className:LoginInterceptor
 * discription:
 * author:Ryb
 * createTime:2018-11-10 16:38
 */
public class LoginInterceptor implements HandlerInterceptor {
    // 快捷键 ctrl + i
   /* @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入业务之前经过了过滤器........");
        //进入业务之前执行的方法
        Object userName = request.getSession().getAttribute("userName");
        if (userName == null) {
            response.sendRedirect("Login");
            return false;
        } else {
            return true;
        }
    }*/

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("视图渲染之前调用的方法........");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("无论如何都会执行的方法...........");
    }
}
