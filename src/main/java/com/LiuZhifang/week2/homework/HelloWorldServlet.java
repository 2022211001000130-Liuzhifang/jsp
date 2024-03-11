package com.LiuZhifang.week2.homework;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Name:LiuZhifang");
        writer.println("ID:2022211001000130");
        writer.println("Date and Time:2024.3.9 12:33");

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
