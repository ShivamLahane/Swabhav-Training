package com.techlabs.actions;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Action;
import com.techlabs.models.Customer;
import com.techlabs.services.DbService;
import com.techlabs.services.SessionService;
import com.techlabs.services.SessionServiceSingletonFactory;
import com.techlabs.models.CustTransaction;

@Controller
public class TransactionAction implements Action
{

	private String operation;
	private String error = "";
	private CustTransaction transaction;
	private Customer customer;
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

	public Customer getCustomer()
	{
		return customer;
	}

	public void setCustomer(Customer customer) 
	{
		this.customer = customer;
	}

	public CustTransaction getTransaction() 
	{
		return transaction;
	}

	public void setTransaction(CustTransaction transaction) 
	{
		this.transaction = transaction;
	}

	public String getError() 
	{
		return error;
	}

	public void setError(String error) 
	{
		this.error = error;
	}

	public String getOperation() 
	{
		return operation;
	}

	public void setOperation(String operation) 
	{
		this.operation = operation;
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
			return this.SUCCESS;
	}
	
	public String doTransaction() throws Exception
	{
		SessionService session = SessionServiceSingletonFactory.getSessionService();
		Map<String, Object> map = session.getMap();
		customer = (Customer) map.get("customer");
		double balance = customer.getBalance() - transaction.getAmount();
//		DbService service = new DbService();
		transaction.setId(UUID.randomUUID().toString());
		transaction.setDate(LocalDateTime.now().toString());
		transaction.setCustomer(customer);
		if (transaction.getType().equals("W"))
		{
			if (balance > Customer.minimumBalance)
			{
				customer.setBalance(balance);
				map.put("customer", customer);
				session.setMap(map);
				service.addTransaction(transaction);
				service.updateBalance(customer);
				return this.SUCCESS;
			}
			setError("Not sufficient balance to make this transaction.");
			return this.ERROR;
		}
		balance = customer.getBalance() + transaction.getAmount();
		customer.setBalance(balance);
		map.put("customer", customer);
		session.setMap(map);
		service.addTransaction(transaction);
		service.updateBalance(customer);
		return this.SUCCESS;
	}

}
