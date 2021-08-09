package com.techlab.reflection.test;

import java.lang.reflect.*;

public class ObjectReflectionTest 
{
	
	public static void main(String[] args) 
	{
		// Object class
		Object obj = new Object();
		Class objClass = obj.getClass();
		doReflection(objClass);
	}
	
	public static void doReflection(Class classObject)
	{
		System.out.println(classObject);
		Method methods[] = classObject.getMethods();
		System.out.println("Total methods: " + methods.length);
		int getterCount = 0;
		int setterCount = 0;
		for(Method method : methods)
		{
			 if(isGetter(method)) 
			{
				 System.out.println("getter: " + method);
				 getterCount++;
			}
			 if(isSetter(method)) System.out.println("setter: " + method);
			{
				 System.out.println("setter: " + method);
				 setterCount++;
			}
		}
		System.out.println("getterCount= " + getterCount);
		System.out.println("setterCount= " + setterCount);
	}
	
	public static boolean isGetter(Method method)
	{
		if(!method.getName().startsWith("get"))      return false;
		if(method.getParameterTypes().length != 0)   return false;  
		if(void.class.equals(method.getReturnType())) return false;
		return true;
	}

	public static boolean isSetter(Method method)
	{
		if(!method.getName().startsWith("set")) return false;
		if(method.getParameterTypes().length != 1) return false;
		return true;
	}

}
