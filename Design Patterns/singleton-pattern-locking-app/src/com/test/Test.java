package com.test;

import com.model.*;

public class Test
{
	public static void main(String[] args) 
	{
		IAutomobileFactory factory1 = new TeslaFactory();
		IAuto auto1 = factory1.make();
		auto1.start();
		auto1.stop();
		auto1.getName();
		auto1.printHashCode();
		IAutomobileFactory factory2 = new TeslaFactory();
		IAuto auto2 = factory2.make();
		auto2.start();
		auto2.stop();
		auto2.getName();
		auto2.printHashCode();
	}
}
