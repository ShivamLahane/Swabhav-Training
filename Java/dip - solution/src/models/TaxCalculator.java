package models;

public class TaxCalculator 
{
	private ILoggable logger;
	
	public TaxCalculator(ILoggable logger)
	{
		this.logger = logger;
	}
	
	public int calculate(int amount, int rate)
	{
		try
		{
			int result = amount / rate;
			return result;
		}
		catch(Exception e)
		{
			logger.log("Divide by 0.");
			return -1;
		}
	}
}
