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
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/transaction", "/passbook"})
public class IsAuthenticatedFilter implements Filter
{

    public IsAuthenticatedFilter()
    {
    	
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		Object customer = session.getAttribute("customer");
		String url = request.getParameter("operation");
		session.setAttribute("url", url);
		if(customer != null)
		{
			chain.doFilter(request, response);
			return;
		}
		HttpServletResponse res = (HttpServletResponse) response;
		res.sendRedirect("http://localhost:8080/bank-app/login");
	}

	public void init(FilterConfig fConfig) throws ServletException
	{
		
	}

}
