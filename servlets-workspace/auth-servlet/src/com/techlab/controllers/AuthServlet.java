package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/auth")
public class AuthServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String password = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		if (name.equals("Shivam") && password.equals("123"))
		{
			out.print("<h1> Welcome Back " + name + "</h1>");
			out.print("<a href = 'location:8080/auth-servlet'> Back </a>");
		}
		else
		{
			out.print("<h1> User not authenticated.</h1>");
			out.print("<a href = 'http://localhost:8080/auth-servlet/'> Back </a>");
		}
	}

}
