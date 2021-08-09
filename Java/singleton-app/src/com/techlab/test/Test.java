package com.techlab.test;

import com.techlab.model.*;

public class Test
{

	public static void main(String[] args) 
	{
		DataService ds1 = DataService.getInstance();
		DataService ds2 = DataService.getInstance();
		ds1.doSomething();
		ds2.doSomething();
		System.out.println(ds1.hashCode());
		System.out.println(ds2.hashCode());
	}

}
