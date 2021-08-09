package com.techlab.test;

import com.techlab.model.*;

public class Test 
{
	public static void main(String[] args) 
	{
		OperationStrategy strategy = new OperationAdd();
		Context context = new Context(strategy);
		System.out.println(context.implementStrategy(10, 20));
	}
}
