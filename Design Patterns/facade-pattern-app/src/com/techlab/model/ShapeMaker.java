package com.techlab.model;

public class ShapeMaker 
{
	Circle circle;
	Rectangle rectangle;
	Triangle triangle;
	
	public ShapeMaker()
	{
		circle = new Circle();
		rectangle = new Rectangle();
		triangle = new Triangle();
	}
	
	public void drawCircle()
	{
		circle.draw();
	}
	
	public void drawRectangle()
	{
		rectangle.draw();
	}
	
	public void drawTriangle()
	{
		triangle.draw();
	}
}
