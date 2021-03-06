package com.techlabs.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.repositories.StudentRepository;

@Service
public class StudentService 	
{
	@Autowired
	private StudentRepository repository;
	
	public StudentService()
	{
		System.out.println("service");
	}
	
	public int getStudentsCount()
	{
		return repository.getStudents().size();
	}
}
