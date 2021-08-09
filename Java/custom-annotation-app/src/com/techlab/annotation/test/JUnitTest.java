package com.techlab.annotation.test;

import java.lang.reflect.Method;

import com.techlab.annotation.*;

public class JUnitTest
{
	public static void main(String[] args) throws Exception
	{
		Class<?> classObj = Foo.class;
		int passingCount = 0;
		int failCount = 0;
		for (Method method : classObj.getMethods())
		{
			if (method.isAnnotationPresent(UnitTestCase.class))
			{
				if ((boolean) method.invoke(new Foo(), null))
				{
					System.out.println(method.getName() + " is passed.");
					passingCount++;
				}
				else
				{
					System.out.println(method.getName() + " is failed.");
					failCount++;
				}
			}
		}
		System.out.println("pass cases: " + passingCount);
		System.out.println("fail cases: " + failCount);
	}
}
