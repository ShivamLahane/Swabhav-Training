package com.techlab.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.techlab.model.Student;

@WebFilter("/edit")
public class IsAuthEditFilter implements Filter 
{

    public IsAuthEditFilter()
    {
    	
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpSession session = httpReq.getSession();
		String UUID = request.getParameter("guid");
		String name = request.getParameter("name");
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
		double cgpa = Double.parseDouble(request.getParameter("cgpa"));
		String location = request.getParameter("location");
		Student student = new Student(UUID, name, rollNo, cgpa, location);
		session.setAttribute("studentToEdit", student);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException
	{
		
	}

}
