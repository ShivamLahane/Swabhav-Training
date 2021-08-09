package com.models;

public class AlarmChecker extends HomeSecurityChecker 
{

	@Override
	public void check(HomeSecurityDto dto) throws Throwable 
	{
		if (dto.alarmOn)
		{
			System.out.println("alarms checked. Ok");
			checkNext(dto);
		}
		else
		{
			throw new Exception("alarms are off");
		}
	}
	
}
