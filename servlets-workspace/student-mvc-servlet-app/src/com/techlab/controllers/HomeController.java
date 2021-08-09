package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.services.StudentDbService;
import com.techlab.services.StudentServiceFactory;

@WebServlet("/home")
public class HomeController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	private StudentDbService service;

    public HomeController() throws Exception 
    {
    	 service = StudentServiceFactory.getStudentService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			request.setAttribute("studentList", service.getStudents());
			HttpSession session = request.getSession();
			Object admin = session.getAttribute("Admin");
			if (admin != null)
			{
				request.setAttribute("User", admin);
			}
			else
			{
				request.setAttribute("User", "Guest");
			}
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/home.jsp");
			view.forward(request, response);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String operation = request.getParameter("operation");
		HttpSession session = request.getSession();
		
		switch (operation)
		{
			case "delete":
				Object admin = session.getAttribute("Admin");
				if (admin != null)
				{
					try
					{
						String GUID = request.getParameter("guid");
						service.deleteStudent(GUID);
						response.sendRedirect("http://localhost:8080/student-mvc-servlet-app/home");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				else
				{
					doGet(request, response);
				}
				break;
			case "logOut":
				session.setAttribute("Admin", null);
				doGet(request, response);
				break;
		}
	}

}
