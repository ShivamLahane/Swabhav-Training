package com.techlab.controllers;

import java.io.IOException;
import java.util.List;

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

@WebServlet("/passbook")
public class PassbookServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public PassbookServlet() 
    {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		try 
		{
			DbService service = new DbService();
			List<Transaction> transactions = service.getTransactions(customer.getName());
			request.setAttribute("customer", customer);
			request.setAttribute("transactions", transactions);
			System.out.println(transactions);
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/passbook.jsp");
			view.forward(request, response);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
