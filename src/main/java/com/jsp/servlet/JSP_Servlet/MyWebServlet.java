package com.jsp.servlet.JSP_Servlet;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Login")
public class MyWebServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();

        String n=request.getParameter("email");
        String p=request.getParameter("password");

        if(n.equals("alhaj@gmail.com") && p.equals("123456")){

            System.out.println("Email "+n);
            System.out.println("Pass "+p);

            response.sendRedirect("welcome.jsp");


        }else {

            System.out.print("Wrong ");
            response.sendRedirect("error.jsp");

        }



       // out.close();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}