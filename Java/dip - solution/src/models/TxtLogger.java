package models;

public class TxtLogger implements ILoggable
{
	@Override
	public void log(String message)
	{
		System.out.println("Writing data in TXT file..\n" + message);
	}
}
