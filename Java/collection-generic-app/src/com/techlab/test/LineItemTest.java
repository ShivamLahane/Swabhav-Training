package com.techlab.test;

import java.util.ArrayList;
import com.techlab.model.LineItem;

public class LineItemTest 
{

	public static void main(String[] args) 
	{
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		// adding to cart
		cart.add(new LineItem(1,"Maggie", 12, 5));
		cart.add(new LineItem(1,"Yippee", 10, 2));
		cart.add(new LineItem(1,"Chings Noodles", 25, 3));
		printCart(cart);
	}

	private static void printCart(ArrayList<LineItem> cart) 
	{
		double sum = 0;
		for (LineItem item : cart)
		{
			sum += item.getTotalItemCost();
		}
		System.out.println("Bill: " + sum);
	}

}

