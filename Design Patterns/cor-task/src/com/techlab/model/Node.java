package com.techlab.model;

public class Node 
{
	protected Node next = null;
	protected String data;
	
	public Node(String data)
	{
		this.data = data;
	}
	
	
	public final void setNext(Node node)
	{
		next = node;
	}
	
	public void checkNext()
	{
		display();
		if (next != null)
		{
			next.checkNext();
		}
		else
		{
			System.out.println();
		}
	}


	protected void display()
	{
		System.out.println(data);
	}
	
}
