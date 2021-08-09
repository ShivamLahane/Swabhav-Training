package com.techlab.test;

import com.techlab.model.*;

public class HatDecoratorTest 
{
	public static void main(String args[])
	{
		// creating normal hats
		IHat premiumHat = new PremiumHat("Prime Hat", 500, "This is a premium hat");
		displayHatDetails(premiumHat);
		
		IHat standardHat = new StandardHat("Cowboy Hat", 300, "This is cow boy hat");
		displayHatDetails(standardHat);
		
		//  coloring premium hat to golden color
		IHat goldenHat = new GoldenHatDecorator(premiumHat, 100);
		displayHatDetails(goldenHat);
		
		// adding golden hat a ribbon
		IHat ribbonedHat = new RibbonedHatDecorator(goldenHat, 200);
		displayHatDetails(ribbonedHat);
	}

	private static void displayHatDetails(IHat hat) 
	{
		System.out.println("name : " + hat.getName());
		System.out.println("price : " + hat.getPrice());
		System.out.println("description : " + hat.getDescription());
		System.out.println();
	}
}
