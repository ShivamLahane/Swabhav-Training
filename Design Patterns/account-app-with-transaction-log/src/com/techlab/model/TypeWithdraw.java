package com.techlab.model;

public class TypeWithdraw implements TransactionType
{

	@Override
	public String getType()
	{
		return "withdraw";
	}	
	
}
