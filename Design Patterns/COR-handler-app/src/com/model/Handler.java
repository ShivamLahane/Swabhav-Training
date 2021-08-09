package com.model;

public abstract class Handler
{
	private Handler next = null;
	
	public void setNext(Handler handler)
	{
		next = handler;
	}
	public abstract void check(DTO dto) throws Throwable;
	
	public void checkNext(DTO dto) throws Throwable
	{
		if (next != null)
		{
			next.check(dto);
		}
		else
		{
			System.out.println("Task Done");
		}
	}
}
