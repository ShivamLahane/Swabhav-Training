package models;

public class Tex 
{
	private boolean out;
	private boolean muddy;
	
	public Tex()
	{
		out = false;
		muddy = false;
	}
	
	public boolean isMuddy()
	{
		return muddy;
	}
	public boolean isOutside()
	{
		return out;
	}
	
	public void getInsideOrOutside()
	{
		if (out) out = false;
		else 
		{
			out = true;
			muddy = true;
		}
	}
	
	public void bath()
	{
		System.out.println("John cleaning Tex...");
		muddy = false;
	}
}
