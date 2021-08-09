package com.techlab.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.techlab.model.*;

public class Test 
{

	public static void main(String[] args) throws IOException 
	{
		List<Student> list = new ArrayList<Student>();
		
		// adding students to set
		list.add(new Student("Shivam", 1, 600, 7, "Panvel"));
		list.add(new Student("Nikhil", 2, 800, 9.0, "Kalyan"));
		list.add(new Student("Deepak", 3, 900, 9.5, "Panvel"));
		list.add(new Student("Omkar", 4, 600, 10, "Bandra"));
		list.add(new Student("Gayatri", 5, 850, 9.0, "Mumbai"));
		list.add(new Student("Raj", 6, 900, 9, "Vashi"));
		list.add(new Student("Vaibhav", 7, 950, 6, "JuiNagar"));
		list.add(new Student("Shreya", 8, 650, 8.7, "Thane"));
		list.add(new Student("Gaurav", 9, 1000, 8.64, "Airoli"));
		list.add(new Student("Kannan", 10, 876, 8.5, "Andheri"));
		list.add(new Student("Shivam", 1, 600, 7, "Panvel"));
		list.add(new Student("Nikhil", 2, 800, 9.0, "Kalyan"));
		list.add(new Student("Deepak", 3, 900, 9.5, "Panvel"));
		list.add(new Student("Omkar", 4, 600, 10, "Bandra"));
		list.add(new Student("Gayatri", 5, 850, 9.0, "Mumbai"));
		
		// eliminate duplicates
		DuplicateEliminator eliminator = new DuplicateEliminator();
		List<Student> setOfStudents = eliminator.eliminateDuplicates(list);
		
		//  create csv file and write student data to it eliminating duplicates
		File file = new File("student.csv");
		CsvFileWriter csvWriter = new CsvFileWriter(setOfStudents, file);
		csvWriter.writeStudentListToFile();
		
		// Analyser
		CgpaAnalyser cgpaAnalyser = new CgpaAnalyser(list);
		printAnalyserResults(cgpaAnalyser);
		
		GreScoreAnalyser greAnalyser = new GreScoreAnalyser(list);
		printAnalyserResults(greAnalyser);
	}
	
	private static void printAnalyserResults(Analyser analyser)
	{
		System.out.println("average: " + analyser.average());
		System.out.println("min student info: ");
		printStudentInfo(analyser.min());
		System.out.println("max student info: ");
		printStudentInfo(analyser.max());
		System.out.println();
	}

	private static void printStudentInfo(Student student) 
	{
		System.out.println(" Name : " + student.getName());
		System.out.println(" Roll No: " + student.getRollNo());
		System.out.println(" Cgpa: " + student.getCgpa());
		System.out.println(" GRE Score: " + student.getGreScore());
		System.out.println(" Location: " + student.getLocation());
	}

}
