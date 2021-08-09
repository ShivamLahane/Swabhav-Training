package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/welcome", "/home"})
public class IdFilter implements Filter 
{
    public IdFilter() 
    {
    	
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		System.out.println("Id Filter");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		if (id > 0)
		{
			chain.doFilter(request, response);
		}
		else
		{
			System.out.print("else");
			out.print("Invalid ID");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}
}
