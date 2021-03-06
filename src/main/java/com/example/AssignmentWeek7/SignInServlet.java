package com.example.AssignmentWeek7;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("count", 1);
        Cookie[] ck = request.getCookies();
        String username = "", password = "";

        for (Cookie c:ck) {
            if (c.getName().equals("username")){
                username = c.getValue();
            }else if (c.getName().equals("password")){
                password = c.getValue();
            }
        }

        if (request.getParameter("username").equals(username) && request.getParameter("password").equals(password)){
            Cookie ck1 = new Cookie("loggedIn", "true");
            ck1.setMaxAge(60*30);
            response.addCookie(ck1);
            response.sendRedirect("MenShop.jsp");
        }else {
            //PrintWriter out = response.getWriter();
            //out.println("Incorrect password or username, try again");
            //out.println(username);
            //out.println(password);
            //out.close();
            request.setAttribute("Error", "Incorrect password or username, try again");
            request.getRequestDispatcher("/message.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
