package com.techlab.model;

import java.util.concurrent.locks.ReentrantLock;

public class DataService 
{
	private static DataService bucket = null;
	
	public void doSomething()
	{
		System.out.println("Work is done by " + this.hashCode());
	}
	
	public static DataService getInstance()
	{
		if (bucket == null)
		{
			synchronized (DataService.class) 
			{
				if (bucket == null)
				{
					bucket = new DataService();
				}	
			}
		}
		return bucket;
	}
}
