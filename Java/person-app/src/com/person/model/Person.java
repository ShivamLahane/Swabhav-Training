package com.person.model;

public class Person 
{
	private int id;
	private float height, weight;
	private String name;
	
	private static int defaultHeight = 165, defaultWeight = 55;
	
	private static int weightIncPerc = 5, weightDecPerc = 10, heightIncPerc = 1; 

	public Person(int id) 
	{
		this(id, "Hermoine Granger");
	}

	public Person(int id, String name) 
	{
		this(id, name, defaultHeight, defaultWeight);
	}
	
	public Person(int id, String name, int height, int weight)
	{
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public float getWeight()
	{
		return weight;
	}
	
	public void eat()
	{
		weight += (float)((weightIncPerc * weight)/100);
	}
	
	public void play()
	{
		weight -= (float) ((weightDecPerc * weight)/100);
		height += (float) ((heightIncPerc * height)/100);
	}
	
	public void displayInfo()
	{
		System.out.println("Id :" + this.id);
		System.out.println("Name :" + this.name);
		System.out.println("Height :" + this.height);
		System.out.println("Weight :" + this.weight);
	}
}
