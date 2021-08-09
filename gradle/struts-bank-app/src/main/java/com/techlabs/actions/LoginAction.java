package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.techlab.models.Customer;
import com.techlab.services.DbService;
import com.techlab.services.SessionService;
import com.techlab.services.SessionServiceSingletonFactory;

public class LoginAction implements Action
{
	private Customer customer;
	private DbService service;
	private String error = "";

	public void setError(String error) 
	{
		this.error = error;
	}

	public DbService getService() 
	{
		return service;
	}

	public void setService(DbService service) 
	{
		this.service = service;
	}

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
		if (map.get("customer") != null)
		{
			return this.ERROR;
		}
		return this.SUCCESS;
	}
	
	public String doLogin() throws Exception
	{
		try
		{
			service = new DbService();
			Customer customer = service.doAuth(this.customer.getName(), this.customer.getPassword());
			if (customer == null)
			{
				setError("Invalid credentials");
				return this.ERROR;
			}
			this.customer.setBalance(customer.getBalance());
			SessionService session = SessionServiceSingletonFactory.getSessionService();
			Map<String, Object> map = session.getMap();
			map.put("customer", customer);
			session.setMap(map);
			Object operation = map.get("operation");
			if (operation != null)
			{
				return (String) operation;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			setError("Invalid credentials");
			return this.ERROR;
		}
		return this.SUCCESS;
	}
	
}
