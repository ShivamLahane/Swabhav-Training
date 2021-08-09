package com.techlab.services;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class SessionService implements SessionAware
{
	private Map<String, Object> map = new HashMap<String, Object>();
	
	public Map<String, Object> getMap() 
	{
		return map;
	}

	public void setMap(Map<String, Object> map) 
	{
		this.map = map;
	}

	@Override
	public void setSession(Map<String, Object> session) 
	{
		this.map = session;
	}

}
