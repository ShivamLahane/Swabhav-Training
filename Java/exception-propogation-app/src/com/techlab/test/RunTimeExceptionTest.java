package com.techlab.test;

public class RunTimeExceptionTest
{
	public static void main(String[] args) 
	{
		System.out.println("Inside main method");
		RunTimeExceptionTest excObj = new RunTimeExceptionTest();
		excObj.f1();
	}

	private void f1() 
	{
		System.out.println("Inside f1");
		this.f2();
	}

	private void f2() 
	{
		System.out.println("Inside f2");
		this.f3();
	}

	private void f3() 
	{
		System.out.println("Inside f3");
		throw new RuntimeException();
	}

}
