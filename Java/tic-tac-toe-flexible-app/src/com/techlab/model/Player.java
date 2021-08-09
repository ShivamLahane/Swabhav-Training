package com.techlab.model;

public class Player
{
	private String mark;
	private String name;
	
	public Player(String mark, String name)
	{
		this.name = name;
		this.mark = mark;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getMark()
	{
		return mark;
	}
}
