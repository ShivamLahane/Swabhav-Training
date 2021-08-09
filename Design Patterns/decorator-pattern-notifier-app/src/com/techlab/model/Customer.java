package com.techlab.model;

public class Customer 
{
	private String name;
	private int id;
	private String emailAddress;
	private String facebookAccount;
	private String slackAccount;
	private String mobileNo;
	private String whatsappNo;
	
	public Customer(String name, int id, String emailAddress,
	String facebookAccount, String slackAccount, String mobileNo, String whatsappNo) 
	{
		this.whatsappNo = whatsappNo;
		this.name = name;
		this.id = id;
		this.emailAddress = emailAddress;
		this.facebookAccount = facebookAccount;
		this.slackAccount = slackAccount;
		this.mobileNo = mobileNo;
	}

	public String getName() 
	{
		return name;
	}

	public int getId()
	{
		return id;
	}

	public String getEmailAddress() 
	{
		return emailAddress;
	}

	public String getFacebookAccount() 
	{
		return facebookAccount;
	}

	public String getSlackAccount() 
	{
		return slackAccount;
	}

	public String getMobileNo() 
	{
		return mobileNo;
	}
	
	public String getWhatsap()
	{
		return whatsappNo;
	}
}
