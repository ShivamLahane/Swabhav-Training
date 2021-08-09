package models;

public class Rabbit implements Animal
{
	@Override
	public void scratch(Door door) throws UnidentifiedAnimalException 
	{
		System.out.println("Rabbit scratches the door.");
		door.pressButton(this);
	}
}
