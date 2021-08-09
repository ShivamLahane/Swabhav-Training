package com.techlab.model;

import java.io.File;
import java.util.Scanner;

public class EmpAnalyser 
{
	private File file;
	private Scanner sc;
	
	public EmpAnalyser(File file) throws Exception
	{
		this.file = file;
	}
	
	public String minSalaryEmp() throws Exception
	{
		sc = new Scanner(file);
		String line[];
		String minSalaryEmpDetails = null;
		int minSalary = Integer.MAX_VALUE;
		while (sc.hasNext())
		{
			String emp = sc.next();
			line = emp.split(",");
			int salary = Integer.parseInt(line[5]);
			if (salary < minSalary)
			{
				minSalary = salary;
				minSalaryEmpDetails = emp;
			}
		}
		return minSalaryEmpDetails;
	}
	
	public String maxSalaryEmp() throws Exception
	{
		sc = new Scanner(file);
		String line[];
		String maxSalaryEmpDetails = null;
		int maxSalary = Integer.MIN_VALUE;
		while (sc.hasNext())
		{
			String emp = sc.next();
			line = emp.split(",");
			int salary = Integer.parseInt(line[5]);
			if (salary > maxSalary)
			{
				maxSalary = salary;
				maxSalaryEmpDetails = emp;
			}
		}
		return maxSalaryEmpDetails;
	}
	
	public int noOfEmpWithDesignation(Designation des) throws Exception
	{
		sc = new Scanner(file);
		int count = 0;
		String line[];
		while (sc.hasNext())
		{
			String emp = sc.next();
			line = emp.split(",");
			String og = line[2];
			String design = og.substring(1, og.length() - 1);
			if (design.equals(des.toString()))
			{
				count++;
			}
		}
		return count;
	}
	
	public int noOfEmpWithDeptNo(int deptNo) throws Exception
	{
		sc = new Scanner(file);
		int count = 0;
		String line[];
		while (sc.hasNext())
		{
			String emp = sc.next();
			line = emp.split(",");
			if (Integer.parseInt(line[7]) == deptNo)
			{
				count++;
			}
		}
		return count;
	}
}
