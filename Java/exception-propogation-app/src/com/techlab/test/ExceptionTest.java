package com.techlab.test;

public class ExceptionTest 
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Inside main method");
		ExceptionTest eObj = new ExceptionTest();
		try
		{
			eObj.f1();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("End of main");
	}

	private void f1() throws Exception
	{
		System.out.println("Inside f1");
		this.f2();
	}

	private void f2() throws Exception 
	{
		System.out.println("Inside f2");
		this.f3();
	}

	private void f3() throws Exception
	{
		System.out.println("Inside f3");
		throw new Exception("Something wrong.");
	}
}
