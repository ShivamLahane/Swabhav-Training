package test;

import business.domain.ClassA;
import data.access.ClassB;

public class Test {

	public static void main(String[] args) 
	{
		ClassA a = new ClassA(new ClassB());
		a.bar();
	}

}
