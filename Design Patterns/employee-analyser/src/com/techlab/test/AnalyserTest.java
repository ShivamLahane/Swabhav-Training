package com.techlab.test;

import java.io.File;
import java.net.URL;

import com.techlab.model.Designation;
import com.techlab.model.EmpAnalyser;
import com.techlab.model.UrlFileFetcherAndDuplicateRemover;

public class AnalyserTest 
{

	public static void main(String[] args) throws Exception
	{
		UrlFileFetcherAndDuplicateRemover urlFetcher = new UrlFileFetcherAndDuplicateRemover(new URL("https://swabhav-tech.firebaseapp.com/emp.txt"), "emp.txt");
		File emp = urlFetcher.getFile();
		EmpAnalyser analyser = new EmpAnalyser(emp);
		System.out.println("max salary emp : " + analyser.maxSalaryEmp());
		System.out.println("min salary emp : " + analyser.minSalaryEmp());
		System.out.println("no of emp with designation salesman : " + analyser.noOfEmpWithDesignation(Designation.SALESMAN));
	}

}
