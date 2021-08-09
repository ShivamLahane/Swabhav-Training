package test;

import model.*;

public class Test
{
	public static void main(String[] args)
	{
		FixedDeposit deposit1 = new FixedDeposit(1, "SHIVAM", 1000, 3, new NormalRate());
		System.out.println(deposit1.calculateSimpleInterest());
		FixedDeposit deposit2 = new FixedDeposit(1, "SHIVAM", 1000, 3, new DiwaliRate());
		System.out.println(deposit2.calculateSimpleInterest());
		FixedDeposit deposit3 = new FixedDeposit(1, "SHIVAM", 1000, 3, new HoliRate());
		System.out.println(deposit3.calculateSimpleInterest());
	}
}
