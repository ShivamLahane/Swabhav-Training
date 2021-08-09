package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Object name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		if (name == null)
		{
			for(int i = 0; i < 10; i++)
			{
				out.print("<h1> Hello World </h1>");
			}
			return;
		}
		for(int i = 0; i < 10; i++)
		{
			out.print("<h1> Hello " + name + "</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	
	public void destroy() 
	{
		
	}

}
