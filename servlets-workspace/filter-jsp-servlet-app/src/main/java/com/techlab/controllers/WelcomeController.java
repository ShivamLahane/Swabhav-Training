package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public WelcomeController() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside servlet");
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		PrintWriter out = response.getWriter();
		out.print("<h1> Welcome " +  name + " </h1>");
	}

}
