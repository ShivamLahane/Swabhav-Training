package models;

public class UnidentifiedAnimalException extends Exception
{
	@Override
	public String getMessage() 
	{
		return "Unidentified animal, only a animal registered with this door can open this door.";
	}
}
