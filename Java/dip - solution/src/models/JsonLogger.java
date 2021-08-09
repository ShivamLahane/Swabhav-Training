package models;

public class JsonLogger implements ILoggable
{
	@Override
	public void log(String message)
	{
		System.out.println("Writing data in JSON file..\n" + message);
	}
}
