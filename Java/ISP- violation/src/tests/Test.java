package tests;

import models.*;

public class Test
{

	public static void main(String[] args) 
	{
		Manager manager = new Manager();
		callInterfaceMethods(manager);
		Robot robot = new Robot();
		callInterfaceMethods(robot);
	}
	
	private static void callInterfaceMethods(IWorkable object)
	{
		object.startWork();
		object.stopWork();
		object.startEat();
		object.stopEat();
	}
}
