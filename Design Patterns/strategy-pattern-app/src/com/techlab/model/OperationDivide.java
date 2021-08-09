package com.techlab.model;

public class OperationDivide implements OperationStrategy
{

	@Override
	public int doOperation(int n1, int n2) 
	{
		return n1 / n2;
	}
	
}
