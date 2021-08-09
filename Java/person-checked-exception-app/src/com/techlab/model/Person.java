package com.techlab.model;

public class Person 
{
	private int id;
	private int age;
	private float height, weight;
	private String name;
	
	private static int minimumAge = 18;
	
	private static int defaultHeight = 165, defaultWeight = 55;
	
	private static int weightIncPerc = 5, weightDecPerc = 10, heightIncPerc = 1; 

	public Person(int id,  int age) throws Exception 
	{
		this(id, "Hermoine Granger", age);
	}

	public Person(int id, String name, int age) throws Exception 
	{
		this(id, name, defaultHeight, defaultWeight, age);
	}
	
	public Person(int id, String name, int height, int weight, int age) throws Exception
	{
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = validate(age);
	}
	
	private int validate(int age) throws Exception
	{
		if (age < minimumAge)
		{
			throw new InvalidAgeException(age, minimumAge);
		}
		else
		{
			return age;
		}
	}

	public int getAge() 
	{
		return age;
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
