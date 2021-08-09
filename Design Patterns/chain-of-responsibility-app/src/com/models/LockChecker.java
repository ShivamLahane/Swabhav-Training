package com.models;

public class LockChecker extends HomeSecurityChecker
{

	@Override
	public void check(HomeSecurityDto dto) throws Throwable 
	{
		if (dto.lockOn)
		{
			System.out.println("locks checked. Ok");
			checkNext(dto);
		}
		else
		{
			throw new Exception("locks are off");
		}
	}
	
}
