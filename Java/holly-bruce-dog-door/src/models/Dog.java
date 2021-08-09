package models;

public class Dog implements Animal
{
	@Override
	public void scratch(Door door) throws UnidentifiedAnimalException
	{
		System.out.println("Dog scratches the door.");
		door.pressButton(this);
	}
}
