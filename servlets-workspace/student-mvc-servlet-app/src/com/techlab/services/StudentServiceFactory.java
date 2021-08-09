package com.techlab.services;

public class StudentServiceFactory
{
	private static StudentDbService studentService = null;
	
	public static StudentDbService getStudentService() throws Exception
	{
		if (studentService == null)
		{
			studentService = new StudentDbService();
			return studentService;
		}
		return studentService;
	}
}