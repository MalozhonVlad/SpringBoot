package com.example.demo.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * делаем фильтр - очень похож на спринг секьюрити...
 */


//@WebFilter("/cookie")
//@Component
public class LogginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        Cookie[] arrayCookies = httpServletRequest.getCookies();
        boolean chekit = false;

        if (arrayCookies == null){
            httpServletResponse.sendRedirect("image");
        }


        for (Cookie cookie : arrayCookies) {
            if (cookie.getName().equals("vlad")) {
                chekit = true;
            }
        }

        if (chekit) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            httpServletResponse.sendRedirect("image");
        }
    }
}
