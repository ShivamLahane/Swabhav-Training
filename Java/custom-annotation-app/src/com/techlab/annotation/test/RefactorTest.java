package com.techlab.annotation.test;

import java.lang.reflect.*;
import com.techlab.annotation.*;

public class RefactorTest 
{

	public static void main(String[] args) 
	{
		doReflection(Customer.class);
	}

	private static void doReflection(Class<?> classObject)
	{
		Method methods[] = classObject.getMethods();
		for (Method method : methods) 
		{
			if (method.isAnnotationPresent(NeedToBeRefactor.class)) System.out.println(method.getName());
		}
	}
}
