package com.example.demo;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "firstServlet", value = "/first-servlet")
public class FirstServlet extends HttpServlet {

    //Life Cycle Methods
         ServletConfig conf;

         public void init(ServletConfig conf){
             this.conf = conf;
             System.out.println("Creating Object: ........");
         }

         public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{

             System.out.println("Servicing...........");

             //set the content type of the response
             resp.setContentType("text/html");

             PrintWriter out = resp.getWriter();
             out.println("<h1>This is my output from servlet service method.</h1>");
             out.println("<h1>Todays date is "+ new Date().toString() +"</h1>");
         }

         public void destroy(){
             System.out.println("Going to destroy servlet object");
         }

         //Non life cycle methods
    public ServletConfig getServletConfig(){
             return this.conf;
    }

    public String getServletInfo(){
             return "This servlet is created by Pritam Nayak";
    }

}
