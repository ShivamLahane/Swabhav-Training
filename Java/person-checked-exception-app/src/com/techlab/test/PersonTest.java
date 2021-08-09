package com.techlab.test;

import com.techlab.model.Person;

public class PersonTest 
{

	public static void main(String[] args) 
	{
		Person p = null;
		try
		{
			 p = new Person(1, 17);
			 p.displayInfo();
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("DONE.");
	}

}
