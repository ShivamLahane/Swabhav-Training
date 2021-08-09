package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.techlab.models.Customer;
import com.techlab.models.CustTransaction;
import com.techlab.services.DbService;
import com.techlab.services.SessionService;
import com.techlab.services.SessionServiceSingletonFactory;

public class PassbookAction implements Action
{
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
		DbService service = new DbService();
		Customer customer1 = (Customer) customer;
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
