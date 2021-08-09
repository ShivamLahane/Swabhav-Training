package com.models;

public abstract class HomeSecurityChecker 
{
	private HomeSecurityChecker next = null;
	
	public void setNext(HomeSecurityChecker next)
	{
		this.next = next;
	}
	
	public abstract void check(HomeSecurityDto dto) throws Exception, Throwable;
	
	public void checkNext(HomeSecurityDto dto) throws Throwable
	{
		if (next != null)
		{
			next.check(dto);
		}
		else
		{
			System.out.println("Home is secured.");
		}
	}
}
