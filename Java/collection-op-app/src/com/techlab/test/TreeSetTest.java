package com.techlab.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest
{

	public static void main(String[] args) 
	{
		// Create
		Set<String> set = new TreeSet<String>();
		
		// Add
		
		set.add("Shivam");
		set.add("Nikhil");
		set.add("Gaurav");
		
		// Display
		
		displaySet(set);
		
		// Delete
		
		set.remove("Gaurav");
		
		// Display
		System.out.println("After removing.");
		displaySet(set);
	}

	private static void displaySet(Set<String> set) 
	{
		for (String name : set)
		{
			System.out.println(name);
		}
	}

}
