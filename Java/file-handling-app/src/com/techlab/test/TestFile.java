package com.techlab.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TestFile
{

	public static void main(String[] args) 
	{
		try
		{
			File file = new File("C:\\Users\\Shivam\\Downloads\\Files\\File.txt");
			file.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("Hello\nWorld");
			bw.close();
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		System.out.println(">>End");
	}
}
