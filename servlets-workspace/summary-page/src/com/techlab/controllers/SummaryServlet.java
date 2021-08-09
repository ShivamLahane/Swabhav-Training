package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/summary")
public class SummaryServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		ServletContext application = getServletContext();
		HttpSession session = request.getSession(false);
		if(session == null)
		{
			out.print("<h1> Session Count : 0 <h1>");
		}
		else
		{
			Object sessionCount = session.getAttribute("sessionCounter");
			if(sessionCount == null)
			{
				out.print("<h1> Session Count : 0 <h1>");
			}
			else
			{
				int count = (int) sessionCount;
				out.print("<h1> Session Count : " + count + "</h1>");
			}
		}
		if(application == null)
		{
			out.print("<h1> Application Count : 0 <h1>");
		}
		else
		{
			Object appCount = application.getAttribute("counter");
			if(appCount == null)
			{
				out.print("<h1> Application Count : 0 <h1>");
			}
			else
			{
				int count = (int) appCount;
				out.print("<h1> Application Count : " + count + "</h1>");
			}
		}
		out.print("<a href = 'http://localhost:8080/summary-page/'> Back </a>");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
