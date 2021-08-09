package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest 
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		// add elements in list
		
		list.add("Shivam");
		list.add("Nikhil");
		list.add("Gayatri");
		
		// read the list
		
		displayList(list);
		
		// read specific index element from list
		
		System.out.println(list.get(2));
		
		// delete specific element from list
		
		list.remove(0);
		
		// display list
		displayList(list);
	}

	private static void displayList(List<String> list) 
	{
		for (String name : list)
		{
			System.out.println(name);
		}
	}

}

