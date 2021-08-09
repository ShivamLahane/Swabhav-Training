package com.techlabs.actions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.techlab.models.CustTransaction;
import com.techlab.services.PassbookFileCreatorService;
import com.techlab.services.SessionService;
import com.techlab.services.SessionServiceSingletonFactory;

public class ExportAction implements Action
{
	private List<CustTransaction> transactions = new ArrayList<CustTransaction>();
	private InputStream fileInputStream;
	
	public InputStream getFileInputStream() 
	{
		return fileInputStream;
	}

	public void setFileInputStream(InputStream fileInputStream) 
	{
		this.fileInputStream = fileInputStream;
	}

	public List<CustTransaction> getTransactions() 
	{
		return transactions;
	}

	public void setTransactions(List<CustTransaction> transactions) 
	{
		this.transactions = transactions;
	}

	@Override
	public String execute() throws Exception 
	{
		SessionService session = SessionServiceSingletonFactory.getSessionService();
		Map<String, Object> map = session.getMap();
		List<CustTransaction> transactions = (List<CustTransaction>) map.get("transactions");
		PassbookFileCreatorService csvMaker = new PassbookFileCreatorService();
		String fileString = csvMaker.createFile(transactions);
		fileInputStream = new ByteArrayInputStream(fileString.getBytes());
		return this.SUCCESS;
	}

}
