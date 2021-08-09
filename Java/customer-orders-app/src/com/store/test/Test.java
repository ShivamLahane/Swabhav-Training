package com.store.test;

import com.store.models.*;

public class Test
{

	public static void main(String[] args)
	{
		
		// creating and storing products for re-use
		Product maggie = new Product("Maggi", 12);
		Product rice = new Product("Rice", 60);
		Product wheat = new Product("Wheat", 42);
		Product oil = new Product("Saffola", 200);
		Product parleG = new Product("Parle-G", 70);
		// creating customers
		Customer shivam = new Customer("Shivam");
		Customer gaurav = new Customer("Gaurav");
		
		Order order1 = new Order("16/05/2021");
		order1.addItem(new LineItem(maggie, 2));
		order1.addItem(new LineItem(maggie, 10));
		order1.addItem(new LineItem(rice, 15));
		order1.addItem(new LineItem(wheat, 5));
		order1.addItem(new LineItem(parleG, 4));
		order1.addItem(new LineItem(parleG, 4));
		order1.addItem(new LineItem(oil, 5));
		order1.addItem(new LineItem(parleG, 6));
		shivam.setOrder(order1);
		
		Order order2 = new Order("16/05/2021");
		order2.addItem(new LineItem(maggie, 10));
		order2.addItem(new LineItem(rice, 15));
		order2.addItem(new LineItem(wheat, 5));
		order2.addItem(new LineItem(parleG, 4));
		order2.addItem(new LineItem(parleG, 4));
		order2.addItem(new LineItem(oil, 5));
		order2.addItem(new LineItem(rice, 10));
		
		gaurav.setOrder(order2);
		
		// display orders
		
		for (Order order : shivam.getOrders())
		{
			System.out.println("Customer Name: " + shivam.getName());
			System.out.println("Order Id: " + order.getId());
			System.out.println("Order details: ");
			for (LineItem item : order.getItems())
			{
				System.out.println(" " + item);
			}
			System.out.println("Order Total: " + order.getCheckoutPrice());
		}
		
		System.out.println();
		
		for (Order order : gaurav.getOrders())
		{
			System.out.println("Customer Name: " + gaurav.getName());
			System.out.println("Order Id: " + order.getId());
			System.out.println("Order details: ");
			for (LineItem item : order.getItems())
			{
				System.out.println(" " + item);
			}
			System.out.println("Order Total: " + order.getCheckoutPrice());
		}
	}
}
