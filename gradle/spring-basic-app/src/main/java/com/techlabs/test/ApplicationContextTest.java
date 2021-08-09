package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.services.StudentService;

public class ApplicationContextTest
{
	public static void main(String args[])
	{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService svc = context.getBean(StudentService.class);
        System.out.println(svc.getStudentsCount());
	}
}
