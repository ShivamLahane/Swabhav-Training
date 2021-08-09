package com.store.test;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.store.models.*;

public class LineItemTest 
{
	@Test
	public void testEquals()
	{
		// arrange
		boolean expectedOutput = true;
		// act
		Product p1 = new Product("milk", 48);
		LineItem item1 = new LineItem(p1, 10);
		LineItem item2 = new LineItem(p1, 12);
		// assert
		assertEquals(expectedOutput, item1.equals(item2));
	}
	
	@Test
	public void testSetTotalPrice()
	{
		// arrange
		double expectedTotalPrice = 480;
		// act
		Product p1 = new Product("milk", 48);
		LineItem item = new LineItem(p1, 10);
		item.setTotalPrice();
		// assert
		assertEquals(expectedTotalPrice, item.getTotalPrice());
	}
	
	@Test
	public void testSetQuantity()
	{
		// arrange
		int expectedQuantity = 10;
		// act
		Product p1 = new Product("milk", 48);
		LineItem item = new LineItem(p1, 5);
		item.addQuantity(5);
		// assert
		assertEquals(expectedQuantity, item.getQuantity());
	}
	
}
