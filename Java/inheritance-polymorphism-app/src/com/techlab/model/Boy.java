package com.techlab.model;

public class Boy extends Men
{
	@Override
	public void play()
	{
		System.out.println("Boys are playing");
	}
	
	@Override
	public void eat()
	{
		System.out.println("Boys are eating");
	}
}
