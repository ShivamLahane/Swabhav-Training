package models;

public class Square extends Rectangle
{
	private int side;
	
	public Square(int side)
	{
		super(side, side);
	}
	
	@Override
	public void setHeight(int height)
	{
		this.height = this.width = height;
	}
	
	@Override
	public void setWidth(int width)
	{
		this.height = this.width = width;
	}
	
}
