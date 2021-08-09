package com.techlabs.actions;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.techlab.models.Customer;
import com.techlab.services.SessionService;
import com.techlab.services.SessionServiceSingletonFactory;

public class HomeAction implements Action
{
	private Customer customer;
	
	public Customer getCustomer() 
	{
		return customer;
	}

	public void setCustomer(Customer customer) 
	{
		this.customer = customer;
	}

	@Override
	public String execute() throws Exception
	{
		SessionService session = SessionServiceSingletonFactory.getSessionService();
		Map<String, Object> map = session.getMap();
		Object customer = map.get("customer");
		if (customer ==  null)
		{
			return "guest";
		}
		this.customer = (Customer) customer;
		return "user";
	}

}
