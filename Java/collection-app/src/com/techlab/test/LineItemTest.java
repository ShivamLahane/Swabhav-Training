package com.techlab.test;

import java.util.ArrayList;
import com.techlab.model.LineItem;

public class LineItemTest 
{

	public static void main(String[] args) 
	{
		ArrayList cart = new ArrayList();
		// adding to cart
		cart.add(new LineItem(1,"Maggie", 12, 5));
		cart.add(new LineItem(1,"Yippee", 10, 2));
		cart.add(new LineItem(1,"Chings Noodles", 25, 3));
		cart.add("abc");
		printCart(cart);
	}

	private static void printCart(ArrayList cart) 
	{
		double sum = 0;
		for (Object obj : cart)
		{
			if (obj.getClass() == LineItem.class)
			{
				LineItem item = (LineItem) obj;
				sum += item.getTotalItemCost();
			}
		}
		System.out.println("sum = " + sum);
	}

}
