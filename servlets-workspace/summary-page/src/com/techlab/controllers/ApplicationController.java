package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/application")
public class ApplicationController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		out.print("<h1> Welcome to Application</h1>");
		out.print("<a href = 'http://localhost:8080/summary-page/'> Back </a>");
		ServletContext application = getServletContext(); 
		Object counter = application.getAttribute("counter");
		if(counter == null)
		{
			application.setAttribute("counter", 1);
			return;
		}
		int count = (int) application.getAttribute("counter");
		application.setAttribute("counter", count + 1);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
