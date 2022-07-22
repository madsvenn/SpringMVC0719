package com.huayu.handler;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    /**
     * 拦截前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("-----------------------"+request.getRequestURL());
        Long start = System.currentTimeMillis();
        System.out.println("start_time: "+start);
        request.setAttribute("start_interceptor",start);
        return false;
    }

    /**
     * 拦截后
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("-----------------------"+request.getRequestURL());
        Long start = System.currentTimeMillis();
        System.out.println("after_time: "+start);
        Long startTime =
                (Long) request.getAttribute("start_interceptor");
        System.out.println("调用的时间为:"+(start-startTime));
    }

    /**
     * 处理完成调用的方法
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("-----------------------"+request.getRequestURL());
    }

}
