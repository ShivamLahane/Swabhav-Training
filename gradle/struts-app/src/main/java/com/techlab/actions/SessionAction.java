package com.techlab.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class SessionAction implements Action, SessionAware
{
	private Map<String, Object> map;
	private int oldCount;
	private int newCount;
	
	public int getOldCount() 
	{
		return oldCount;
	}

	public int getNewCount() 
	{
		return newCount;
	}

	@Override
	public String execute() throws Exception 
	{
		Integer count = (Integer) this.getSession().get("counter");
		if (count == null)
		{
			count = 0;
			this.oldCount = count;
			this.newCount = count;
		}
		else
		{
			this.oldCount = count;
			this.newCount = ++count;
		}
		this.getSession().put("counter", count);
		return this.SUCCESS;
	}
	
	public Map<String, Object> getSession() 
	{
		return map;
	}
	
	@Override
	public void setSession(Map<String, Object> session) 
	{
		this.map = (SessionMap<String, Object>) session;
	}

}
