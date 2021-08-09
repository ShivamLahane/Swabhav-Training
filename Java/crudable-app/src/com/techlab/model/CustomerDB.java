package com.techlab.model;

public class CustomerDB implements Icrudable
{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Created CustomerDB");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("This is cust DB");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Updated cust DB");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Deleted cust DB");
	}

}
