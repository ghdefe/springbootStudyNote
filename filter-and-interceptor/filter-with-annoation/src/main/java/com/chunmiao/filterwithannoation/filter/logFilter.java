package com.chunmiao.filterwithannoation.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebFilter(urlPatterns = "/*",filterName = "filter2")
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
