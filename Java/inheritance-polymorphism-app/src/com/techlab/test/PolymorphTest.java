package com.techlab.test;

import com.techlab.model.*;

public class PolymorphTest
{
	
	public static void atThePark(Men obj)
	{
		obj.play();
		obj.eat();
	}
	
	public static void main(String args[])
	{
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
		atThePark(new Men());
	}
}
