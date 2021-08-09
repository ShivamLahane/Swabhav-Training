package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.models.Customer;
import com.techlab.services.DbService;

@WebServlet("/login")
public class LoginController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public LoginController()
    {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/login.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		DbService service;
		try 
		{
			service = new DbService();
			String name = request.getParameter("name");
			String password = request.getParameter("pwd");
			Customer customer = service.doAuth(name, password);
			if(customer != null)
			{
				HttpSession session = request.getSession();
				session.setAttribute("customer", customer);
				Object url = session.getAttribute("url");
				if (url != null)
				{
					response.sendRedirect("http://localhost:8080/bank-app/" + url);
				}
				else
				{
					response.sendRedirect("http://localhost:8080/bank-app/home");
				}
				return;
			}
			request.setAttribute("fail", true);
			doGet(request, response);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
