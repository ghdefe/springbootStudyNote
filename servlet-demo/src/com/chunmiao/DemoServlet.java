package com.chunmiao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get方法触发");
        PrintWriter writer = resp.getWriter();
        writer.print("this is servlet html,doGet method Test!");
        writer.flush();
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post方法触发");
        PrintWriter writer = resp.getWriter();
        writer.print("this is servlet html,doPost method Test!");
        writer.flush();
        writer.close();
    }
}
