package com.store.test;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.store.models.*;

public class OrderTest 
{
	@Test
	public void testAddItem()
	{
		// arrange
		int expectedIndex1 = 0;
		int expectedIndex2 = -1;
		// act
		Product p1 = new Product("milk", 48);
		Product p2 = new Product("wheat", 45);
		LineItem item1 = new LineItem(p1, 10);
		LineItem item2 = new LineItem(p2, 12);
		Order order = new Order("27/02/2021");
		order.addItem(item1);
		int actual1 = order.checkIfExists(item1);
		int actual2 = order.checkIfExists(item2);
		// assert
		assertEquals(expectedIndex1, actual1);
		assertEquals(expectedIndex2, actual2);
	}
	
	@Test
	public void testSetCheckoutPrice()
	{
		// arrange
		double expected = 1500;
		// act
		Product p1 = new Product("milk", 48);
		Product p2 = new Product("wheat", 45);
		LineItem item1 = new LineItem(p1, 10);
		LineItem item2 = new LineItem(p2, 12);
		LineItem item3 = new LineItem(p1, 10);
		Order order = new Order("27/02/2021");
		order.addItem(item1);
		order.addItem(item2);
		order.addItem(item3);
		// assert
		assertEquals(expected, order.getCheckoutPrice());
	}
}
