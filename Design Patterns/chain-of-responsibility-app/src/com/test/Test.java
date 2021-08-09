package com.test;

import com.models.AlarmChecker;
import com.models.HomeSecurityDto;
import com.models.LightChecker;
import com.models.LockChecker;

public class Test
{
	public static void main(String args[]) throws Throwable
	{
		LightChecker light = new LightChecker();
		AlarmChecker alarm = new AlarmChecker();
		LockChecker lock = new LockChecker();
		light.setNext(alarm);
		alarm.setNext(lock);
		HomeSecurityDto dto = new HomeSecurityDto();
		dto.lightsOff = false;
		dto.alarmOn = true;
		dto.lockOn = true;
		try
		{
			light.check(dto);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
