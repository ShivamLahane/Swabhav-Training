package com.techlabs.actions;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.services.SessionService;
import com.techlabs.services.SessionServiceSingletonFactory;

public class LogoutAction implements Action
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
