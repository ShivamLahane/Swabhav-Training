package com.techlabs.dbServices;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.models.CustTransaction;
import com.techlabs.models.Customer;

@Repository
public class DbRepository
{
//	private Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//	private SessionFactory sessionFactory = cfg.buildSessionFactory();
	@Autowired
	private SessionFactory sessionFactory;
	
//	public SessionFactory getFactory()
//	{
//		return sessionFactory;
//	}
//
//	public void setFactory(SessionFactory factory)
//	{
//		this.sessionFactory = factory;
//	}

	public DbRepository()
	{
		System.out.println("DbRepo");
	}

	public void insertCustomer(Customer customer)
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(customer);
			transaction.commit();
			session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void updateCustomer(Customer customer)
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(customer);
			transaction.commit();
			session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void addTransaction(CustTransaction transction) throws Exception
	{
		try
		{
			Session session = sessionFactory.openSession();
			Transaction transactionOrg = session.beginTransaction();
			session.save(transction);
			transactionOrg.commit();
			session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public Customer doAuth(String name, String password) throws Exception
	{
		System.out.println(sessionFactory);
		Session session = sessionFactory.openSession();
		Customer customer = (Customer) session.get(Customer.class, name);
		session.close();
		if (customer != null && customer.getPassword().equals(password))
		{
			return customer;
		}
		return null;
	}

	public List<CustTransaction> getTransactions(String name)
	{
		System.out.println("inside get txn");
		Session session = sessionFactory.openSession();
		Customer customer = new Customer();
		customer.setName(name);
		Query query = session.createQuery("FROM CustTransaction t WHERE t.customer = :customer");
		query.setParameter("customer", customer);
		List<CustTransaction> list = query.list();
		return list;
	}

	public void updateBalance(Customer customer)
	{
		Session session = sessionFactory.openSession();
		Transaction trx = session.beginTransaction();
		session.saveOrUpdate(customer);
		trx.commit();
		session.close();
	}

	public boolean checkIfNameAlreadyPresent(String name) throws Exception
	{
		Session session = sessionFactory.openSession();
		Customer customer = (Customer) session.get(Customer.class, name);
		if (customer != null)
		{
			return true;
		}
		return false;
	}
}
