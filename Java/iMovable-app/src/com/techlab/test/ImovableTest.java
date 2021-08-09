package com.techlab.test;

import com.techlab.model.*;

public class ImovableTest 
{
	public static void main(String args[])
	{
		IMovable objs[] = new IMovable[3];
		objs[0] = new Bike();
		objs[1] = new Car();
		objs[2] = new Truck();
		startRace(objs);
	}

	private static void startRace(IMovable objs[]) 
	{
		// TODO Auto-generated method stub
		for (IMovable obj : objs)
		{
			obj.move();
		}
		
		System.out.println("Race stopped.");
	}
}
