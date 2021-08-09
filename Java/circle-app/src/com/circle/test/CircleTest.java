package com.circle.test;

import java.util.Scanner;
import com.circle.model.Circle;
import com.circle.model.Color;

public class CircleTest 
{
	
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Circle circle = new Circle(10, Color.BLUE.toString());

		printInfo(circle);
		
		// Create Circle array and find Circle with largest area
		
		Circle circles[] = new Circle[5];
		
		for (int i = 0; i < 5; i++)
		{
			circles[i] = new Circle(sc.nextInt());
		}
		System.out.println("========||========");
		Circle biggestCircle = Circle.whichIsBiggestCircle(circles);
		System.out.println(biggestCircle.calculateArea());
		System.out.println("======Bigger Circle=======");
		System.out.println(circle.whichIsBigger(circles[0]).getRadius());
	}
	private static void printInfo(Circle c) 
	{
		System.out.println(c.getRadius());
		System.out.println(c.getColor());
		System.out.println(c.calculateArea());
		System.out.println(c.calculatePeri());
	}

}
