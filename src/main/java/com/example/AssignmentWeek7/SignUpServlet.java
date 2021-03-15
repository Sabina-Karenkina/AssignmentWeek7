package com.example.AssignmentWeek7;
import com.example.AssignmentWeek7.SignUpServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie name = new Cookie("name", request.getParameter("name"));
        Cookie surname = new Cookie("surname", request.getParameter("surname"));
        Cookie username = new Cookie("username", request.getParameter("username"));
        Cookie email = new Cookie("email", request.getParameter("email"));
        Cookie password = new Cookie("password", request.getParameter("password"));

        username.setMaxAge(60*30);
        email.setMaxAge(60*30);
        password.setMaxAge(60*30);
        name.setMaxAge(60*30);
        surname.setMaxAge(60*30);

        response.addCookie(username);
        response.addCookie(email);
        response.addCookie(password);
        response.addCookie(name);
        response.addCookie(surname);

        response.sendRedirect("signIn.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie name = new Cookie("name", request.getParameter("name"));
        Cookie surname = new Cookie("surname", request.getParameter("surname"));
        Cookie username = new Cookie("username", request.getParameter("username"));
        Cookie email = new Cookie("email", request.getParameter("email"));
        Cookie password = new Cookie("password", request.getParameter("password"));

        username.setMaxAge(60*30);
        email.setMaxAge(60*30);
        password.setMaxAge(60*30);
        name.setMaxAge(60*30);
        surname.setMaxAge(60*30);

        response.addCookie(username);
        response.addCookie(email);
        response.addCookie(password);
        response.addCookie(name);
        response.addCookie(surname);

        response.sendRedirect("signIn.jsp");
    }
}
