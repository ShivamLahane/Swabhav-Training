package com.techlab.services;

import java.util.List;

import com.techlab.models.Transaction;

public class PassbookFileCreatorService 
{
	public String createFile(List<Transaction> transactions)
	{
		try 
		{
//			String name = "C:\\Users\\Shivam\\Downloads\\Files\\" 
//							+ transactions.get(0).getName() + "-" + transactions.size() + ".csv";
//			File file = new File(name);
//			if(file.createNewFile())
//			{
//				BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
//				writer.write("Amount, Type, Date \n");
			String s = "";
				for (Transaction transaction : transactions)
				{
					s += transaction.getAmount() + "," + transaction.getType() + "," + transaction.getDate() + "\n";
				}
//			}
			return s;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}
