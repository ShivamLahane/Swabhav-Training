package com.person.test;

import com.person.model.Person;

public class PersonTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Person p = new Person(1);
		p.displayInfo();
		System.out.println("Eating...");
		System.out.println();
		p.eat();
		System.out.println("Ate.");
		System.out.println();
		p.displayInfo();
		System.out.println("Playing...");
		System.out.println();
		p.play();
		System.out.println("Stopped.");
		System.out.println();
		p.displayInfo();
	}

}
