package tests;

import java.util.concurrent.TimeUnit;
import models.Door;
import models.Remote;

public class DoorTest2
{
	public static void main(String[] args) throws Throwable
	{
		Door door = new Door();
		Remote remote = new Remote(door);
		System.out.println("Dog door status: " + DoorTest1.dogDoorStatus(door));
		System.out.println("Dog barks.");
		System.out.println("Remote button pressed.");
		remote.pressButton();
		System.out.println("Dog door status: " + DoorTest1.dogDoorStatus(door));
		System.out.println("Dog goes out.");
		System.out.println("Dog came inside.");
		System.out.println("Dog door status: " + DoorTest1.dogDoorStatus(door));
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Dog door status: " + DoorTest1.dogDoorStatus(door));
	}
}
