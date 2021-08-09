package models;

public class Robot implements IWorkable
{

	@Override
	public void startWork() 
	{
		System.out.println("Robot starts working.");
	}

	@Override
	public void stopWork() 
	{
		System.out.println("Robot stops working.");
	}

}
