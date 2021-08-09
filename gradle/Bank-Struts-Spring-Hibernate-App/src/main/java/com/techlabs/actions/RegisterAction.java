package com.techlabs.actions;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Action;
import com.techlabs.models.Customer;
import com.techlabs.services.DbService;
import com.techlabs.models.CustTransaction;

@Controller
public class RegisterAction implements Action
{
	private Customer customer;
	@Autowired
	private DbService service;
	private String error = "";
	
	public String getError() 
	{
		return error;
	}

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
		System.out.println("Register Action");
		return this.SUCCESS;
	}
	
	public String doRegister() throws Exception
	{
		try
		{
			if(service.checkIfNameAlreadyPresent(customer.getName()))
			{
				setError("Name Already taken");
				return this.ERROR;
			}
			double minBal = Customer.minimumBalance;
			if (customer.getBalance() < minBal)
			{
				setError("Minimum balance should be " + minBal);
				return this.ERROR;
			}
			service = new DbService();
			service.insertCustomer(customer);
			CustTransaction transaction = new CustTransaction();
			transaction.setAmount(customer.getBalance());
			transaction.setCustomer(customer);
			transaction.setDate(LocalDateTime.now().toString());
			transaction.setType("D");
			transaction.setId(UUID.randomUUID().toString());
			service.addTransaction(transaction);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			setError("Entered data is invalid");
			return this.ERROR;
		}
		return this.SUCCESS;
	}
	
}
