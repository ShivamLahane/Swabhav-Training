package tests;

import models.IShape;
import models.Rectangle;
import models.Square;

public class LspTest 
{
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle(100, 50);
		shouldNotChangeHeightIfWidthIsChanged(rect);
		Square square = new Square(100);
		shouldNotChangeHeightIfWidthIsChanged(square);
	}

	private static void shouldNotChangeHeightIfWidthIsChanged(IShape shape)
	{
		System.out.println(shape.calculateArea());
	}
}
