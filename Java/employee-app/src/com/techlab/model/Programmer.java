package com.techlab.model;

public class Programmer extends Employee
{
	private double bonus;
	
	public double getBonus()
	{
		return bonus;
	}
	
	public Programmer(int id, String name, double salary, double bonus) 
	{
		super(id, name, salary);
		this.bonus = bonus;
	}

}
