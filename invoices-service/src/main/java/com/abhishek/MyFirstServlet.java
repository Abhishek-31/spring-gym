package com.abhishek;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response){
      response.setContentType("text/html; charset=UTF-8");
      try{
        response.getWriter().print(
            "<html>\n" +
                "<body>\n" +
                "<h1>Hello World</h1>\n" +
                "<p>This is my very first, embedded Tomcat, HTML Page!</p>\n" +
                "</body>\n" +
                "</html>");
      } catch(Exception e){
        System.out.println("Exception came");
      }


  }
}


