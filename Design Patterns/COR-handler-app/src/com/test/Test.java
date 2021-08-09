package com.test;

import com.model.*;

public class Test 
{
	public static void main(String[] args) 
	{
		CookieHandler cookie = new CookieHandler();
		AuthHandler auth = new AuthHandler();
		CompressionHandler compression = new CompressionHandler();
		cookie.setNext(auth);
		auth.setNext(compression);
		DTO dto = new DTO();
		dto.username = "admin";
		dto.password = "admin";
		try 
		{
			cookie.check(dto);
		} 
		catch (Throwable e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
