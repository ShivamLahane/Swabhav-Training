package models;

public class TaxCalculator 
{
	private LogType log;
	
	public TaxCalculator(LogType log)
	{
		this.log = log;
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
			if (log.equals(LogType.JSON)) new JsonLogger().log("Divide by 0.");
			else if (log.equals(LogType.TXT)) new TxtLogger().log("Divide by 0");
			else if (log.equals(LogType.JSON)) new XmlLogger().log("Divide by 0.");
			return -1;
		}
	}
}
