package com.techlab.model;

public class InvalidAgeException extends Exception
{
	private String message;
	private int personAge;
	private int minAge;

	public InvalidAgeException(int age, int minAge) 
	{
		this.personAge = age;
		this.minAge = minAge;
	}

	@Override
	public String getMessage() 
	{
		this.setMessage();
		return this.message;
	}

	public void setMessage() 
	{
		this.message = "Invalid age " + personAge + ". The minimum age should be " + minAge; 
	}

}
