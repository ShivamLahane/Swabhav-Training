package com.techlab.test;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest
{

	public static void main(String[] args) 
	{
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		// Insert
		map.put("Shivam", 100);
		map.put("Gaurav", 101);
		map.put("Saurav", 102);
		
		// Modify one element
		
		map.put("Shivam", 001);
		
		// Read
		
		for (String name : map.keySet())
		{
			System.out.println("Name: " + name + "\nKey: " + map.get(name));
		}
		
		// Read specific element
		
		System.out.println(map.get("Saurav"));
		
		// Delete specific element
		
		map.remove("Shivam");
		
		// Read
		for (String name : map.keySet())
		{
			System.out.println("Name: " + name + "Key " + map.get(name));
		}
	}

}
