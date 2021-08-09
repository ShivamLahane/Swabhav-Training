package com.techlab.controllers;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/home"})
public class CredentialFilter implements Filter 
{

    public CredentialFilter() 
    {
    	
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		if (id == 1 && name.equals("Shivam"))
		{
			System.out.println("Inside cred ch");
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

}
