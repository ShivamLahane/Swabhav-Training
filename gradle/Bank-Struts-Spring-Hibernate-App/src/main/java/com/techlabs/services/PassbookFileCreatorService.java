package com.techlabs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techlabs.models.CustTransaction;

@Service
public class PassbookFileCreatorService 
{
	public String createFile(List<CustTransaction> transactions)
	{
		try 
		{
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
