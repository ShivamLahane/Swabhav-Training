package com.techlab.test;

import com.techlab.model.DataService;

public class Test
{

	public static void main(String[] args) 
	{
		
		Thread t1 = new Thread(new Runnable() 
		{ 
			public void run() 
			{
				DataService ds1 = DataService.getInstance();
				ds1.doSomething();
			}
		});
		
		Thread t2 = new Thread(new Runnable() 
		{ 
			public void run() 
			{
				DataService ds2 = DataService.getInstance();
				ds2.doSomething();
			}
		});
		t1.start();
		t2.start();
	}

}
