package models;

public class Door 
{
	private boolean open;
	
	public Door()
	{
		open = false;
	}
	
	public void doOpenOrClose()
	{
		if (isOpen()) close();
		else open();
	}
	
	public boolean isOpen()
	{
		return open;
	}
	
	public void open()
	{
		open = true;
	}

	public void close() 
	{
		open = false;
	}
}
