package com.techlabs.actions;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.techlab.services.SessionService;
import com.techlab.services.SessionServiceSingletonFactory;

public class LogoutAction extends LoginAction implements Action
{

	@Override
	public String execute() throws Exception
	{
		SessionService session = SessionServiceSingletonFactory.getSessionService();
		Map<String, Object> map = session.getMap();
		map.put("customer", null);
		session.setMap(map);
		return this.SUCCESS;
	}

}
