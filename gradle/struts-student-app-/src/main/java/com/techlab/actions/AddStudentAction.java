package com.techlab.actions;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlab.models.StudentViewModel;
import com.techlab.services.StudentServiceFactory;
import com.techlab.services.StudentServices;

public class AddStudentAction implements Action
{
	private StudentViewModel student;
	private String error = "";
	private StudentServices service = StudentServiceFactory.getStudentService();
	
	public List<StudentViewModel> getStudents()
	{
		return service.getStudents();
	}

	public void setStudents(List<StudentViewModel> students) 
	{
		service.setStudents(students);
	}

	public String getError() 
	{
		return error;
	}

	public void setError(String error) 
	{
		this.error = error;
	}

	public StudentViewModel getStudent()
	{
		return student;
	}

	public void setStudent(StudentViewModel student) 
	{
		this.student = student;
	}

	@Override
	public String execute() throws Exception 
	{
		return this.SUCCESS;
	}
	
	public String doAdd()
	{
		try
		{
			 if(student.getCgpa() > 10.0 || student.getCgpa() < 0.0)
			 {
				 System.out.println("error");
				 this.setError("CGPA is greater than 10.0");
				 return this.ERROR;
			 }
			 if(student.getName() == null || student.getName().equals(""))
			 {
				 System.out.println("error");
				 this.setError("CGPA is greater than 10.0");
				 return this.ERROR;
			 }
		}
		catch(Exception e)
		{
			 this.setError("Some details are wrong");
			 return this.ERROR;
		}
		service.addStudent(student);
		return this.SUCCESS;
	}
}
