package models;

import java.util.List;

public class BarkRecognizer 
{
	private Door door;
	
	public BarkRecognizer(Door door)
	{
		this.door = door;
	}
	
	public void recognizeBark(Bark bark) throws Exception
	{
		System.out.println("Dog barks.");
		List<Bark> barks = door.getAllowedBarks();
		boolean found = false;
		int i = 0;
		while (!found && i < barks.size())
		{
			if (bark.equals(barks.get(i))) found = true;
			i++;
		}
		if (found)
		{
			if (door.isOpen()) door.close();
			else door.open();
		}
		else
		{
			System.out.println("Bark not recognized.");
		}
	}
}
