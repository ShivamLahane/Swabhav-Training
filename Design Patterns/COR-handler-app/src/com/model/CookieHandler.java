package com.model;

public class CookieHandler extends Handler
{
	private void writeCookie()
	{
		System.out.println("Writing cookie into cookies.");
	}
	
	@Override
	public void check(DTO dto) throws Throwable 
	{
		writeCookie();
		checkNext(dto);
	}

}
