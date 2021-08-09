package models;

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
		else door.open();
	}
}
