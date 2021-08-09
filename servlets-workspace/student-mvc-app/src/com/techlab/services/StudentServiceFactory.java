package com.techlab.services;

public class StudentServiceFactory
{
	private static StudentService studentService = null;
	
	public static StudentService getStudentService()
	{
		if (studentService == null)
		{
			studentService = new StudentService();
			return studentService;
		}
		return studentService;
	}
}