package com.techlab.model;

public class Context 
{
	private OperationStrategy strategyClass;
	
	public Context(OperationStrategy strategy)
	{
		strategyClass = strategy;
	}
	
	public int implementStrategy(int n1, int n2)
	{
		return strategyClass.doOperation(n1, n2);
	}
}
