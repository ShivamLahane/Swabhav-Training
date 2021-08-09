package com.model;

public class AuthHandler extends Handler
{

	@Override
	public void check(DTO dto) throws Throwable 
	{
		if (dto.username.equals("admin") && dto.password.equals("admin"))
		{
			System.out.println("Authorized");
			checkNext(dto);
		}
		else
		{
			throw new Exception("Username or password doesnt match.");
		}
	}

}
