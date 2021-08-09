package com.techlab.services;

public class SessionServiceSingletonFactory
{
	private static SessionService service = null;
	
	public static SessionService getSessionService()
	{
		if (service == null)
		{
			service = new SessionService();
		}
		return service;
	}
}
