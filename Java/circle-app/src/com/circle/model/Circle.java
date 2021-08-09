package com.circle.model;

public class Circle 
{
	private int radius;
	
	private String color;
	
	private int validate(int r)
	{
		if (r >= 10 && r <= 50)
		{
			return r;
		}
		else
		{
			return 	10;
		}
	}
	
	public Circle (int rad)
	{
		this(rad, Color.YELLOW.toString());
	}
	
	public Circle(int rad, String colour)
	{
		radius = validate(rad);
		color = colour;
	}
	
	public int getRadius() 
	{
		return radius;
	}

	public String getColor() 
	{
		return color;
	}
	
	public float calculateArea()
	{
		return (float) (Math.PI * Math.pow(radius, 2));
	}
	
	public float calculatePeri()
	{
		return (float) (2 * Math.PI * radius);
	}
	
	public static Circle whichIsBiggestCircle(Circle arr[])
	{
		Circle biggest = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i].radius > biggest.radius)
			{
				biggest = arr[i];
			}
		}
		return biggest;
	}
	
	public Circle whichIsBigger(Circle c)
	{
		if (this.radius > c.radius)
		{
			return this;
		}
		else
		{
			return c;
		}
	}
}
