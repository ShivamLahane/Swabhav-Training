package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.models.Customer;
import com.techlab.models.Transaction;
import com.techlab.services.DbService;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public RegistrationServlet() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/registration.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			DbService service = new DbService();
			String name = request.getParameter("name");
			if (service.checkIfNameAlreadyPresent(name))
			{
				request.setAttribute("status", "Name already taken");
				doGet(request, response);
				return;
			}
			double balance = Double.parseDouble(request.getParameter("balance"));
			String password = request.getParameter("pwd");
			double minBal = Customer.minimumBalance;
			if (balance < minBal)
			{
				request.setAttribute("status", "Minimum balance requirement is " + minBal);
				doGet(request, response);
				return;
			}
			service.insertCustomer(new Customer(name, balance, password));
			service.addTransaction(new Transaction(name, balance, "D"));
			response.sendRedirect("http://localhost:8080/bank-app/login");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
