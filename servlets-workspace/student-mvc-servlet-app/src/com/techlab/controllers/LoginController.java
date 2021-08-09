package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.services.AuthService;

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
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		AuthService service = new AuthService();
		if(service.checkCredentials(name, password))
		{
			HttpSession session = request.getSession();
			session.setAttribute("Admin", name);
			String operation = (String) session.getAttribute("operation");
			response.sendRedirect("http://localhost:8080/student-mvc-servlet-app/" + operation);
			return;
		}
		request.setAttribute("fail", true);
		doGet(request, response);
	}

}
