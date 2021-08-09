package com.techlab.filters;

import java.io.IOException;
import java.net.http.HttpRequest;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.model.Student;

@WebFilter(urlPatterns = {"/edit", "/add"})
public class IsAuthFilter implements Filter
{

    public IsAuthFilter() 
    {
    	
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		HttpSession session = httpRequest.getSession();
		String operation = request.getParameter("operation");
		if (operation != null && operation.equals("edit"))
		{
			String UUID = request.getParameter("guid");
			String name = request.getParameter("name");
			int rollNo = Integer.parseInt(request.getParameter("rollNo"));
			double cgpa = Double.parseDouble(request.getParameter("cgpa"));
			String location = request.getParameter("location");
			Student student = new Student(UUID, name, rollNo, cgpa, location);
			session.setAttribute("studentToEdit", student);
		}
		session.setAttribute("operation", operation);
		Object admin = session.getAttribute("Admin");
		if (admin ==  null)
		{
			httpResponse.sendRedirect("http://localhost:8080/student-mvc-servlet-app/login");
			return;
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException
	{
		
	}

}
