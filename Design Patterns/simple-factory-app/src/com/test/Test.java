package com.test;

import com.model.*;

public class Test
{
	public static void main(String[] args) 
	{
		AutomobileFactory factory = new AutomobileFactory();
		IAuto auto1 = factory.make(AutoType.TESLA);
//		auto1.start();
//		auto1.stop();
//		auto1.getName();
		System.out.println(auto1.hashCode());
		IAuto auto2 = factory.make(AutoType.TESLA);
//		auto2.start();
//		auto2.stop();
//		auto2.getName();
		System.out.println(auto2.hashCode());
	}
}
