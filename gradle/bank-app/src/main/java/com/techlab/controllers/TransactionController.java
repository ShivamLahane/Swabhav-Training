package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.models.Customer;
import com.techlab.models.Transaction;
import com.techlab.services.DbService;

@WebServlet("/transaction")
public class TransactionController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public TransactionController() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/transaction.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			double amount = Double.parseDouble(request.getParameter("amount"));
			String type = request.getParameter("type");
			HttpSession session = request.getSession();
			Customer customer = (Customer) session.getAttribute("customer");
			DbService service = new DbService();
			double balance;
			if (type.equals("W"))
			{
				balance = customer.getBalance() - amount;
				double minBal = Customer.minimumBalance;
				if(balance < minBal)
				{
					request.setAttribute("status", "Not Sufficient Balance to make this transaction");
					doGet(request, response);
					return;
				}
			}
			else
			{
				balance = customer.getBalance() + amount;
			}
			service.updateBalance(customer.getName(), balance);
			service.addTransaction(new Transaction(customer.getName(), amount, type));
			customer.setBalance(balance);
			response.sendRedirect("http://localhost:8080/bank-app/home");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			request.setAttribute("status", "Invalid amount");
			doGet(request, response);
		}
	}
	
}
