package com.example.quiz.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "setThemecolor", value = "/setThemecolor")
public class setThemecolor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("/settheme.jsp").forward(request , response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String Bg = request.getParameter("theme");
    Cookie ck = new Cookie("bgk", Bg);
    ck.setMaxAge(60*60*24*7);
    response.addCookie(ck);
    response.sendRedirect("index.jsp");
    }
}