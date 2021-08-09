package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.model.Student;
import com.techlab.services.StudentDbService;
import com.techlab.services.StudentServiceFactory;

@WebServlet("/add")
public class AddController extends HttpServlet
{
	private StudentDbService service;
	private static final long serialVersionUID = 1L;
       
    public AddController() throws Exception 
    {
    	service = StudentServiceFactory.getStudentService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		Object admin = session.getAttribute("Admin");
		request.setAttribute("User", admin);
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/add.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			String name = request.getParameter("name");
			int rollNo = Integer.parseInt(request.getParameter("rollNo"));
			double cgpa = Double.parseDouble(request.getParameter("cgpa"));
			String location = request.getParameter("location");
			service.addStudent(new Student(name, rollNo, cgpa, location));
			response.sendRedirect("http://localhost:8080/student-mvc-servlet-app/home");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
