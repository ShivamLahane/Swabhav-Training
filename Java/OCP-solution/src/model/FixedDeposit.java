package model;

public class FixedDeposit 
{
	private int no;
	private String name;
	private double principle;
	private int years;
	private IFestival festival;
	
	public int getNo() 
	{
		return no;
	}
	public String getName()
	{
		return name;
	}
	public double getPrinciple()
	{
		return principle;
	}
	public int getYears() 
	{
		return years;
	}
	public FixedDeposit(int no, String name, double principle, int years, IFestival festival)
	{
		this.no = no;
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
	}
	
	public double calculateSimpleInterest()
	{
		return principle * (1 + (festival.getRate() * years));
	}
}
