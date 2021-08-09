package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements StorageItem
{
	private String name;
	private List<StorageItem> childrens;
	
	public Folder(String name) 
	{
		this.name = name;
		this.childrens = new ArrayList<StorageItem>();
	}

	public String getName() 
	{
		return name;
	}

	public List<StorageItem> getChildrens()
	{
		return childrens;
	}
	
	public void addChildren(StorageItem item)
	{
		childrens.add(item);
	}

	@Override
	public void display() 
	{
		System.out.println("Folder name: " + name);
		for (StorageItem item : childrens)
		{
			item.display();
		}
	}
}
