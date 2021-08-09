package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.services.StudentService;
import com.techlab.services.StudentServiceFactory;

@WebServlet("/home")
public class HomeController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public HomeController() 
    {
    	System.out.println("HomeController created");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		StudentService service = StudentServiceFactory.getStudentService();
		request.setAttribute("count", service.getStudentCount());
		request.setAttribute("studentList", service.getStudents());
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/home.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
