package tests;

import models.*;

public class Test
{
	public static void main(String args[]) throws Exception
	{
		Animal bruce = new Dog();
		Animal rabbit = new Rabbit();
		Door door = new Door(bruce);
		System.out.println("Door status: " + getDoorStatus(door));
		bruce.scratch(door);
		System.out.println("Door status: " + getDoorStatus(door));
		System.out.println("Bruce is outside.");
		try
		{
			rabbit.scratch(door);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Door status: " + getDoorStatus(door));
		bruce.scratch(door);
		System.out.println("Door status: " + getDoorStatus(door));
	}

	private static String getDoorStatus(Door door) 
	{
		String open = "open";
		String close = "close";
		if (door.isOpen()) return open;
		else return close;
	}
}
