package com.techlab.model;

public class CellAlreadyMarkedException extends Exception 
{
	private String message;
	
	public CellAlreadyMarkedException(String message)
	{
		this.message = message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
}
