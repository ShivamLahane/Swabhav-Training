package com.techlabs.tests;



import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.models.Talent;



public class HibernateTest 
{
	private Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	private SessionFactory factory = cfg.buildSessionFactory();
	
	public static void main(String args[]) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
	{
		HibernateTest test = new HibernateTest();
		System.out.println("insert");
		test.insert(new Talent(3, "A", 10.0));
		test.read();
		System.out.println("update");
		test.update(new Talent(3, "A", 9.0));
		test.read();
		System.out.println("delete");
		test.delete(new Talent(3, "A", 9.0));
		test.read();
	}
	
	private void insert(Talent talent)
	{
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(talent);
		txn.commit();
		session.close();
	}
	
	private void delete(Talent talent)
	{
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.delete(talent);
		txn.commit();
		session.close();
	}
	
	private void update(Talent talent)
	{
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.saveOrUpdate(talent);
		txn.commit();
		session.close();
	}
	
	private void read()
	{
		 Session session = factory.openSession();
		 Query query = session.createQuery("from Talent t"); 
		 List talents = query.list();
		 for (Object talent : talents)
		 {
			 Talent talentO = (Talent) talent;
			 System.out.println("name : " + talentO.getName() + ", CGPA : " + talentO.getCgpa() + ", id : " + talentO.getId());
			 System.out.println();
		 }
		 session.close();
	}
}