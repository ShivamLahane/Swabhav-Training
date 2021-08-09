package tests;

import java.util.concurrent.TimeUnit;
import models.*;

public class DoorTest1 
{
	public static void main(String args[]) throws Exception
	{
		Door door = new Door();
		BarkRecognizer barkRecognizer = new BarkRecognizer(door);
		System.out.println("door open?: " + door.isOpen());
		String bark = "Whau whau";;
		barkRecognizer.recognizeBark(bark);
		System.out.println("door open?: " + door.isOpen());
		System.out.println("dog goes out.");
		System.out.println("door open?: " + door.isOpen());
		TimeUnit.SECONDS.sleep(5);
		System.out.println("door open?: " + door.isOpen());
		System.out.println("Dog is outside");
		System.out.println("Dog barks again.");
		barkRecognizer.recognizeBark(bark);
		System.out.println("door open?: " + door.isOpen());
	}
}
