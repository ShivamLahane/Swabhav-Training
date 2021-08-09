package com.techlab.model;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class AsyncPrinter implements Runnable
{

	@Override
	public void run() 
	{
		while (true)
		{
			System.out.println(LocalDateTime.now());
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
