package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class DuplicateEliminator 
{
	List<Student> studentsSet = new ArrayList<Student>();
	
	public List<Student> eliminateDuplicates(List<Student> students)
	{
		for (Student student : students)
		{
			if (!duplicatePresent(student))
			{
				studentsSet.add(student);
			}
		}
		return studentsSet;
	}
	
	private boolean duplicatePresent(Student student)
	{
		for (Student student1 : studentsSet)
		{
			if (student1.equals(student)) return true;
		}
		return false;
	}
}
