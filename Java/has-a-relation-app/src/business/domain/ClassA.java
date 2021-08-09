package business.domain;

import data.access.ClassB;
import fooable.Fooable;

public class ClassA implements Fooable
{
	ClassB b;
	
	public ClassA(ClassB b)
	{
		this.b = b;
	}
	
	public void bar()
	{
		this.foo();
	}
}
