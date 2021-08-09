package com.techlab.actions;

import java.time.LocalDateTime;

import com.opensymphony.xwork2.Action;

public class BrowseAction implements Action
{
	private String time;
	
	
	public String getTime() 
	{
		return LocalDateTime.now().toString();
	}

	public void setTime(String time) 
	{
		this.time = time;
	}

	@Override
	public String execute() throws Exception 
	{
		return this.SUCCESS;
	}

}
