package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.BeerExpert;

@WebServlet("/BeerSelect")
public class BeerSelect extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		BeerExpert expert = new BeerExpert();
//		PrintWriter out = response.getWriter();
		List<String> brands = expert.getBrands(request.getParameter("color"));
//		out.print("<h1> Beer Recommendation Servlet </h1>");
//		for (String brand : brands)
//		{
//			out.print("<p> try : " + brand + " </p>");
//		}
		
		request.setAttribute("brands", brands);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
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
