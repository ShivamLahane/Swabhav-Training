package models;

public class CodeDoesntMatchException extends Exception 
{
	@Override
	public String getMessage()
	{
		return "Input code doesn't match.";
	}
}
