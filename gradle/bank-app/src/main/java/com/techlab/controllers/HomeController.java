package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class HomeController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
    public HomeController() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		Object customer = session.getAttribute("customer");
		request.setAttribute("customer", customer);
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/home.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String operation = request.getParameter("operation");
		HttpSession session = request.getSession();
		
		switch(operation)
		{
			case "logOut":
				System.out.println("out");
				session.setAttribute("customer", null);
				response.sendRedirect("http://localhost:8080/bank-app/home");
				break;
		}
	}

}
