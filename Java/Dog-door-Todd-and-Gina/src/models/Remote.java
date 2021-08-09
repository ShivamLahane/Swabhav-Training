package models;

import java.util.Timer;
import java.util.TimerTask;

public class Remote
{
	private Door door;
	
	public Remote(Door door)
	{
		this.door = door;
	}
	
	public void pressButton()
	{
		if (door.isOpen()) door.close();
		else 
		{
			door.open();
			final Timer timer = new Timer();
			timer.schedule(
			new TimerTask() 
			{
				@Override
				public void run() 
				{
					door.close();
				}
			}, 5);
		}
	}
}
