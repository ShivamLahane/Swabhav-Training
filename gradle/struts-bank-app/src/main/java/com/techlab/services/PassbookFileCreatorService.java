package com.techlab.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techlab.models.CustTransaction;

@Service
public class PassbookFileCreatorService 
{
	public String createFile(List<CustTransaction> transactions)
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
//				for (Transaction transaction : transactions)
//				{
//					writer.write(transaction.getAmount() + "," + transaction.getType() + "," + transaction.getDate() + "\n");
//				}
//				writer.close();
//			}
			String s  = "";
			for (CustTransaction transaction : transactions)
			{
				s += transaction.getAmount() + "," + transaction.getType() + "," + transaction.getDate() + "\n";
			}
			return s;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}
