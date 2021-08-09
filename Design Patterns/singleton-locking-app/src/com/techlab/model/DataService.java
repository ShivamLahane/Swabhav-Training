package com.techlab.model;

import java.util.concurrent.locks.ReentrantLock;

public class DataService 
{
	private static DataService bucket = null;
	private static ReentrantLock lock = new ReentrantLock();
	
	private DataService()
	{
	}
	
	public void doSomething()
	{
		System.out.println("Work is done by " + this.hashCode());
	}
	
	public static DataService getInstance()
	{
		lock.lock();
		if (bucket == null)
		{
			bucket = new DataService();
		}
		return bucket;
	}
}
