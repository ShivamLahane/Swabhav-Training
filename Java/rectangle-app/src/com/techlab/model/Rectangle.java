package com.techlab.model;

public class Rectangle 
{
	
	private int width, height;
	
	private Thickness thickness;
	
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
	
	/*
	 * private String validateThickness(String value) { // TODO Auto-generated
	 * method stub if (value != "low" && value != "medium" && value != "high") {
	 * return "low"; } else { return value; } }
	 */
	public Rectangle(int pWidth, int pHeight)
	{
		this(pWidth, pHeight, Thickness.LOW);
	}
	public Rectangle(int pwidth, int pheight, Thickness level) 
	{
		// TODO Auto-generated constructor stub
		width = validate(pwidth);
		height = validate(pheight);
		thickness = level;
	}

	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public String getThickness()
	{
		return thickness.toString();
	}
	
	public int calculateArea()
	{
		return width * height;
	}
}
