package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.Student;
import com.techlab.services.StudentService;
import com.techlab.services.StudentServiceFactory;

@WebServlet("/add")
public class AddController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public AddController() 
    {
    	System.out.println("AddController created");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/add.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		StudentService service = StudentServiceFactory.getStudentService();
		String name = request.getParameter("name");
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
		double cgpa = Double.parseDouble(request.getParameter("cgpa"));
		String location = request.getParameter("location");
		service.addStudent(new Student(name, rollNo, cgpa, location));
		response.sendRedirect("http://localhost:8080/student-mvc-app/home");
	}

}
