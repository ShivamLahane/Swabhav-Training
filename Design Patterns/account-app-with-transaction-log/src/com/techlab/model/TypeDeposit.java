package com.techlab.model;

public class TypeDeposit implements TransactionType
{
	@Override
	public String getType()
	{
		return "deposit";
	}
}
