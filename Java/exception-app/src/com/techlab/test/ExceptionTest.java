package com.techlab.test;

public class ExceptionTest 
{
	
	public static void main(String[] args) throws Exception
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			System.out.println("a ==> " + a);
			System.out.println("b ==> " + b);
			
			int c = a/b;
			System.out.println(c);
			System.out.println("End of Main.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
