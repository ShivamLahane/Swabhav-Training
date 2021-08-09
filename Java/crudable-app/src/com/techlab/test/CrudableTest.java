package com.techlab.test;

import com.techlab.model.*;

public class CrudableTest 
{
	
	private static void crud(Icrudable obj)
	{
		System.out.println("---------------------------------------------");
		System.out.println(" ");
		obj.create();
		obj.read();
		obj.update();
		obj.delete();
		System.out.println("---------------------------------------------");
		System.out.println(" ");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		crud(new CustomerDB());
		crud(new InvoiceDB());
		crud(new DeptDB());
	}

}
