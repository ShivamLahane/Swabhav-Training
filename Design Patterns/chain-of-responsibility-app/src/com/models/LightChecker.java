package com.models;

public class LightChecker extends HomeSecurityChecker
{

	@Override
	public void check(HomeSecurityDto dto) throws Throwable 
	{
		if (dto.lightsOff)
		{
			System.out.println("lights checked. Ok");
			checkNext(dto);
		}
		else
		{
			throw new Exception("Lights are on");
		}
	}

}
