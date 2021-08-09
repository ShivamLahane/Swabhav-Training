package tests;

import java.util.concurrent.TimeUnit;

import models.*;

public class Test
{
	public static void main(String[] args) throws Exception 
	{
		Tex tex = new Tex();
		Door door = new Door();
		Remote remote = new Remote(door);
		doorStatus(door);
		System.out.println("Tex outside?: " + tex.isOutside());
		System.out.println("John opens door");
		remote.pressButton();
		doorStatus(door);
		TimeUnit.SECONDS.sleep(2);
		tex.getInsideOrOutside();
		doorStatus(door);
		System.out.println("Tex outside?: " + tex.isOutside());
		System.out.println("Tex is muddy?: " + tex.isMuddy());
		System.out.println("John opening door.");
		remote.pressButton();
		doorStatus(door);
		tex.bath();
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Tex is muddy?: " + tex.isMuddy());
		doorStatus(door);
	}
	
	public static void doorStatus(Door door)
	{
		if(door.isOpen()) System.out.println("Door is open");
		else System.out.println("Door is closed.");
	}
}
