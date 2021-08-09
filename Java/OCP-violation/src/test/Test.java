package test;

import model.FestivalType;
import model.FixedDeposit;

public class Test {

	public static void main(String[] args) 
	{
		FixedDeposit deposit1 = new FixedDeposit(1, "SHIVAM", 1000, 3, FestivalType.NORMAL);
		System.out.println(deposit1.calculateSimpleInterest());
		FixedDeposit deposit2 = new FixedDeposit(1, "SHIVAM", 1000, 3, FestivalType.DIWALI);
		System.out.println(deposit2.calculateSimpleInterest());
		FixedDeposit deposit3 = new FixedDeposit(1, "SHIVAM", 1000, 3, FestivalType.HOLI);
		System.out.println(deposit3.calculateSimpleInterest());
	}

}
