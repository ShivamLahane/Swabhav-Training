package com.techlab.test;

import com.techlab.model.Rectangle;
import com.techlab.model.Thickness;

public class RectangleTest 
{

	public static void printRectangleInfo(Rectangle r) 
	{
		System.out.println("Width: " + r.getWidth());
		System.out.println("Height: " + r.getHeight());
		System.out.println("Area : " + r.calculateArea());
		System.out.println("Thickness :" + r.getThickness());
		System.out.println("HashCode :" + r.hashCode());
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Rectangle big = new Rectangle(10, 20, Thickness.HIGH);
		Rectangle small = new Rectangle(5, 10);
		Rectangle rectArr[] = new Rectangle[3];
		rectArr[0] = big;
		rectArr[1] = small;
		rectArr[2] = new Rectangle(1,2);
		for (Rectangle rect : rectArr)
		{
			printRectangleInfo(rect);
		}
	}

}
