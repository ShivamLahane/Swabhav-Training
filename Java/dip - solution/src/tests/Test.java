package tests;

import models.*;

public class Test 
{
	public static void main(String args[])
	{
		TaxCalculator taxCalculator = new TaxCalculator(new JsonLogger());
		System.out.println(taxCalculator.calculate(10, 5));
		System.out.println(taxCalculator.calculate(0, 0));
	}
}
