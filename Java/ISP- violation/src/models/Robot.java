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

	@Override
	public void startEat() 
	{
		System.out.println("Robot starts eating.");
	}

	@Override
	public void stopEat()
	{
		System.out.println("Robot stops eating.");		
	}

}
