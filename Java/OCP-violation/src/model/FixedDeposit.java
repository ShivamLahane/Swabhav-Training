package model;

public class FixedDeposit 
{
	private int no;
	private String name;
	private double principle;
	private int years;
	private FestivalType festival;
	
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
	public FestivalType getFestival()
	{
		return festival;
	}
	public FixedDeposit(int no, String name, double principle, int years, FestivalType festival)
	{
		this.no = no;
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
	}
	
	public double calculateSimpleInterest()
	{
		double interest = 0;
		if (FestivalType.NORMAL.equals(festival)) interest = principle * (1 + (7 * years));
		else if (FestivalType.HOLI.equals(festival)) interest = principle * (1 + (8 * years));
		else if (FestivalType.DIWALI.equals(festival)) interest = principle * (1 + (10 * years));
		return interest;
	}
}
