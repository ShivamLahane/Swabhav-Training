package models;

public class BarkRecognizer 
{
	private Door door;
	
	public BarkRecognizer(Door door)
	{
		this.door = door;
	}
	
	public void recognizeBark(String bark)
	{
		System.out.println("Dog barked.");
		System.out.println(bark);
		if (door.isOpen()) door.close();
		else door.open();
	}
}
