package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Action;
import com.techlabs.models.Customer;
import com.techlabs.services.DbService;
import com.techlabs.services.SessionService;
import com.techlabs.services.SessionServiceSingletonFactory;
import com.techlabs.models.CustTransaction;

@Controller
public class PassbookAction implements Action
{
	@Autowired
	private DbService service;

	public DbService getService()
	{
		return service;
	}

	public void setService(DbService service)
	{
		this.service = service;
	}

	private List<CustTransaction>  transactions = new ArrayList<CustTransaction>();
	private Customer customer;
	private String operation;
	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public List<CustTransaction> getTransactions() 
	{
		return transactions;
	}

	public void setTransactions(List<CustTransaction> transactions) 
	{
		this.transactions = transactions;
	}

	@Override
	public String execute() throws Exception
	{
		SessionService session = SessionServiceSingletonFactory.getSessionService();
		Map<String, Object> map = session.getMap();
		Object customer = map.get("customer");
		map.put("operation", operation);
		if (customer == null)
		{
			return this.ERROR;
		}
		Customer customer1 = (Customer) customer;
		System.out.println(customer1.getName());
		setTransactions(service.getTransactions(customer1.getName()));
		map.put("transactions", getTransactions());
		session.setMap(map);
		this.customer = customer1;
		return this.SUCCESS;
	}

	public Customer getCustomer() 
	{
		return customer;
	}

	public void setCustomer(Customer customer) 
	{
		this.customer = customer;
	}
	
}
