package com.techlab.model;

public abstract class OrderProcessTemplate
{
	
	public boolean isGift;
	public abstract void doPayment();

	public final void giftWrap() 
	{
		System.out.println("Gift wrap successful");
	}

	public final void processOrder(boolean isGift) 
	{
		doSelect();
		doPayment();
		if (isGift)
		{
			giftWrap();
		}
		doDelivery();
	}
	
	public abstract void doDelivery();
	public abstract void doSelect();
}
