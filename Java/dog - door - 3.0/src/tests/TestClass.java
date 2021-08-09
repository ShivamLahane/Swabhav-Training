package tests;

import java.util.concurrent.TimeUnit;

import models.*;

public class TestClass 
{
	public static void main(String args[]) throws Exception
	{
		Door door = new Door();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Bark bark1 = new Bark("Ruff!Ruff!");
		Bark bark2 = new Bark("Whoo..");
		Bark bark3 = new Bark("Yip!Yip!");
		door.addAllowedBark(bark1);
		door.addAllowedBark(bark2);
		door.addAllowedBark(bark3);
		doorStatus(door);
		recognizer.recognizeBark(new Bark("Acchiii"));
		doorStatus(door);
		recognizer.recognizeBark(bark2);
		doorStatus(door);
		System.out.println("after 5 seconds.");
		TimeUnit.SECONDS.sleep(5);
		doorStatus(door);
	}

	private static void doorStatus(Door door) 
	{
		if (door.isOpen()) System.out.println("Door is open.");
		else System.out.println("Door is close.");
	}
}
