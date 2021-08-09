package com.techlab.model;

import java.util.List;

public class GreScoreAnalyser extends Analyser
{
	
	public GreScoreAnalyser(List<Student> students) 
	{
		super(students);
	}

	@Override
	public double average()
	{
		int sum = 0;
		for (Student student : students)
		{
			sum += student.getGreScore();
		}
		return sum / students.size();
	}

	@Override
	public Student min() 
	{
		double min = Double.MAX_VALUE;
		Student minGreScoreStudent = null;
		for (Student student : students)
		{
			if (student.getGreScore() < min)
			{
				min = student.getGreScore();
				minGreScoreStudent = student;
			}
		}
		return minGreScoreStudent;
	}

	@Override
	public Student max() 
	{
		double max = Double.MIN_VALUE;
		Student maxGreScoreStudent = null;
		for (Student student : students)
		{
			if (student.getGreScore() > max)
			{
				max = student.getGreScore();
				maxGreScoreStudent = student;
			}
		}
		return maxGreScoreStudent;
	}
}


