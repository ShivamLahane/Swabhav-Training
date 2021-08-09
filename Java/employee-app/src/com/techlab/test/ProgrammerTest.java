package com.techlab.test;

import com.techlab.model.Programmer;

public class ProgrammerTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Programmer coder = new Programmer(10, "Shivam", 30000, 4000);
		System.out.println("Id: " + coder.getId());
		System.out.println("Name: " + coder.getName());
		System.out.println("Salary: " + coder.getSalary());
		System.out.println("Bonus: " + coder.getBonus());
	}

}
