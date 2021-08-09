package com.techlabs.repositories;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.models.Student;

@Repository
public class StudentDbRepository
{
//	private Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//	private SessionFactory sessionFactory = cfg.buildSessionFactory();
	@Autowired
	private SessionFactory sessionFactory;
	
	public StudentDbRepository() throws Exception
	{
		System.out.println("Repository created");
	}
	
	public List<Student> getStudents() throws Exception
	{
		 Session session = sessionFactory.openSession();
		 Query query = session.createQuery("from Student s"); 
		 List<Student> students = query.list();
		 session.close();
		 return students;
	}
	
	public void addStudent(Student student)
	{
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(student);
		txn.commit();
		session.close();
	}

	public void updateStudent(Student student)
	{
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.saveOrUpdate(student);
		txn.commit();
		session.close();
	}

	public void deleteStudent(String id)
	{
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		Student student = new Student();
		student.setId(id);
		session.delete(student);
		txn.commit();
		session.close();
	}
}
