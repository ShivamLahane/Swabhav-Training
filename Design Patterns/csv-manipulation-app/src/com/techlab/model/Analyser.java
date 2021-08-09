package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Analyser 
{
	protected List<Student> students = new ArrayList<Student>();
	
	public Analyser(List<Student> students)
	{
		this.students = students;
	}
	
	public abstract double average();
	
	public abstract Student min();
	
	public abstract Student max();
}
