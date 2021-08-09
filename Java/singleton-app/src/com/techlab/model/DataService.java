package com.techlab.model;

public class DataService 
{
	private static DataService bucket = null;
	
	private DataService()
	{
	}
	
	public void doSomething()
	{
		System.out.println("Work is done by " + this.hashCode());
	}
	
	public static DataService getInstance()
	{
		if (bucket == null)
		{
			bucket = new DataService();
			return bucket;
		}
		else
		{
			return bucket;
		}
	}
}
