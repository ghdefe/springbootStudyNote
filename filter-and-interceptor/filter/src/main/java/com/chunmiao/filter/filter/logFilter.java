package com.chunmiao.filter.filter;


import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class logFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入过滤器");
        long startTime = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("响应时间：" + (System.currentTimeMillis() - startTime));
        System.out.println("过滤程序完成");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器关闭");
    }
}
