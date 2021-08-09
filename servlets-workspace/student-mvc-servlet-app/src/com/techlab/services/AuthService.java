package com.techlab.services;

import java.util.HashMap;

public class AuthService
{
	HashMap<String, String> map = new HashMap<String, String>();
	
	public AuthService()
	{
		map.put("Shivam", "Shivam");
		map.put("Admin", "Shivam");
		map.put("MyAdmin", "myAdmin");
	}
	
	public boolean checkCredentials(String userName, String password)
	{
		if(map.containsKey(userName) && map.get(userName).equals(password))
		{	
			return true;
		}
		return false;
	}
}
