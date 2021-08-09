package com.techlab.services;

public class StudentServiceFactory 
{
	private static StudentServices service = null;
	
	public static StudentServices getStudentService()
	{
		if (service == null)
		{
			service = new StudentServices();
			return service;
		}
		return service;
	}
}
