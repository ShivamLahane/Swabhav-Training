package com.techlab.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EditCsvFile 
{

	public static void main(String[] args) throws IOException 
	{
		File copyEmp = new File("empCpy.csv");
		FileWriter fw = new FileWriter(copyEmp);
		File emp = new File("C:\\Users\\Shivam\\Documents\\Code Stuff\\Java\\edit-file-app\\emp.csv");
		Scanner sc = new Scanner(emp);
		while (sc.hasNext())
		{
			String line[] = sc.next().trim().split(",");
			for (String word : line)
			{
				if (word.equals("KING"))
				{
					fw.write("SHIVAM,");
				}
				else
				{
					fw.write(word + ",");
				}
			}
			fw.write("\n");
		}
		fw.close();
		emp.delete();
		System.out.println("Copied file..");
		sc = new Scanner(copyEmp);
		while (sc.hasNext())
		{
			System.out.println(sc.next());
		}
	}
}
