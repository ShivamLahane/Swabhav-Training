package tests;

import models.*;

public class Test
{

	public static void main(String[] args) 
	{
		Manager manager = new Manager();
		callEatableMethods(manager);
		Robot robot = new Robot();
		callWorkableMethods(robot);
	}
	
	private static void callWorkableMethods(IWorkable object)
	{
		object.startWork();
		object.stopWork();
	}
	
	private static void callEatableMethods(IWorkEat object)
	{
		object.startWork();
		object.stopWork();
		object.startEat();
		object.stopEat();
	}
	
}
