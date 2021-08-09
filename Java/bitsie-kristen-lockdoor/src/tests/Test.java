package tests;

import models.*;

public class Test 
{
	public static void main(String[] args) throws Exception
	{
		Door door = new Door();
		Keypad keypad = new Keypad("1234", door);
		System.out.println("Dog door status: " + dogDoorStatus(door));
		System.out.println("Code 1244 is entered");
		try
		{
			keypad.matchAndLockOrUnlock("1244");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Dog door status: " + dogDoorStatus(door));
		System.out.println("Code 1234 is entered.");
		keypad.matchAndLockOrUnlock("1234");
		System.out.println("Dog door status: " + dogDoorStatus(door));
		
	}
	
	public static String dogDoorStatus(Door door)
	{
		String open = "open";
		String closed = "closed";
		if (door.isOpen()) return open;
		else return closed;
	}
}
