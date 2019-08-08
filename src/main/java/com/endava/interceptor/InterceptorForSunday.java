package com.endava.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.Date;

public class InterceptorForSunday extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        if (calendar.get(Calendar.DAY_OF_WEEK)==1){
            response.getWriter().write("web page is not available on sunday");
            return false;
        } else {
            return true;
        }
    }
}
