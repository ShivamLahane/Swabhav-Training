package tests;

import models.*;

public class LspTest 
{
	public static void main(String aargs[])
	{
		Rectangle rect = new Rectangle(10, 20);
		shouldNotChangeHeightIfWidthIsChanged(rect);
		Square square = new Square(100);
		shouldNotChangeHeightIfWidthIsChanged(square);
	}

	private static void shouldNotChangeHeightIfWidthIsChanged(Rectangle rect)
	{
		int beforeWidth = rect.getWidth();
		rect.setHeight(rect.getHeight() + 100);
		int afterWidth = rect.getWidth();
		System.out.println(beforeWidth == afterWidth);
	}
}
