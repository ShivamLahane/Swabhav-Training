package com.tehlab.test;

import com.techlab.model.*;

public class Test
{
	public static void main(String args[])
	{
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new HatAdapter(new Hat("ht", "Hat", 100)));
		printCart(cart);
	}

	private static void printCart(ShoppingCart cart) 
	{
		for (Item item : cart.getItems())
		{
			System.out.println(item.itemName());
			System.out.println(item.itemPrice());
		}
	}
}
