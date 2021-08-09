package com.techlab.model;

public class TypeRevert implements TransactionType
{

	@Override
	public String getType() 
	{
		return "reverted";
	}
	
}
