package models;

public class Rectangle 
{
	protected int height;
	protected int width;
	
	public Rectangle(int h, int w)
	{
		setHeight(h);
		setWidth(w);
	}

	public int getHeight()
	{
		return height;
	}

	public int getWidth() 
	{
		return width;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}
	
}
