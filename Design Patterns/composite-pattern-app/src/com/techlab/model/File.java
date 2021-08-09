package com.techlab.model;

public class File implements StorageItem 
{
	private String name;
	private int size;
	private String type;
	
	public File(String name, int size, String type) 
	{
		this.name = name;
		this.size = size;
		this.type = type;
	}

	public String getName() 
	{
		return name;
	}

	public int getSize()
	{
		return size;
	}

	public String getType() 
	{
		return type;
	}

	@Override
	public void display()
	{
		System.out.println("File name: " + name);
		System.out.println("File size: " + size + "Kb");
		System.out.println("File type: " + type);
	}

}
