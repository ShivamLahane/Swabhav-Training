package com.techlab.reflection.model;

public class Rectangle 
{
	
	private int width, height;
	
	private static final int min = 1, max = 100;
	
	private static int validate(int value)
	{
		if (value < min)
		{
			return min;
		}
		else if (value > max)
		{
			return max;
		}
		else
		{
			return value;
		}
	}
	
	public Rectangle(int pwidth, int pheight) 
	{
		// TODO Auto-generated constructor stub
		width = validate(pwidth);
		height = validate(pheight);
	}

	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int calculateArea()
	{
		return width * height;
	}
}
