package models;

import java.util.Timer;
import java.util.TimerTask;

public class Door 
{
	private boolean open;
	private Animal dog;
	
	public Door(Animal animal)
	{
		open = false;
		this.dog = animal;
	}
	
	public boolean isOpen()
	{
		return open;
	} 
	
	public void open()
	{
		open = true;
	}
	
	public void close()
	{
		open = false;
	}
	
	public void pressButton(Animal animal) throws UnidentifiedAnimalException
	{
		if (this.dog.equals(animal))
		{
			if (isOpen()) 
			{
				open = false;
			}
			else 
			{
				open = true;
				final Timer timer = new Timer();
				timer.schedule(new TimerTask() { public void run() { close(); } }, 10);
			}
		}
		else throw new UnidentifiedAnimalException();
	}
}
