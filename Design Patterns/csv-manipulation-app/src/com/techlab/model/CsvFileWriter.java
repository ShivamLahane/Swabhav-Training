package com.techlab.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileWriter
{
	private List<Student> students = new ArrayList<Student>();
	private File file;
	
	public CsvFileWriter(List<Student> students, File file)
	{
		this.students = students;
		this.file = file;
	}
	
	public List<Student> getStudents()
	{
		return students;
	}
	public void writeStudentListToFile() throws IOException
	{
		FileWriter writer = new FileWriter(file);
		String header = "Name, RollNo, CGPA, GRE Score, Location,";
		writer.write(header);
		writer.write("\n");
		for (Student student : students)
		{
			writer.write(student.getName() + ",");
			writer.write(student.getRollNo() + ",");
			writer.write(student.getCgpa() + ",");
			writer.write(student.getGreScore() + ",");
			writer.write(student.getLocation() + ",");
			writer.write("\n");
		}
		writer.close();
	}
}
