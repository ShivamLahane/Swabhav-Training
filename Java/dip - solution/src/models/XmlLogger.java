package models;

public class XmlLogger implements ILoggable
{
	@Override
	public void log(String message)
	{
		System.out.println("Writing data in XML file..\n" + message);
	}
}
