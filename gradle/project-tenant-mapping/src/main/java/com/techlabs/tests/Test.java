package com.techlabs.tests;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.models.Task;
import com.techlabs.models.Tenant;
import com.techlabs.models.User;

public class Test
{
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		
		System.out.println(configuration);
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		
		Tenant tenant = new Tenant();
		tenant.setName("yxz Corpn");
		
		User u1 = new User();
		u1.setName("us1");
		u1.setRole("Sr. Engineer");
		u1.setTenant(tenant);
		
		Task tsk1 = new Task();
		tsk1.setId(UUID.randomUUID().toString());
		tsk1.setParentTask(null);
		tsk1.setTaskTxt("task1 us1");
		tsk1.setUser(u1);
		
		Task tsk2 = new Task();
		tsk2.setId(UUID.randomUUID().toString());
		tsk2.setTaskTxt("subtask 1, of task1 us1");
		tsk2.setParentTask(tsk1);
		tsk2.setUser(u1);
		
		Set<Task> tsk12 = new HashSet<Task>();
		tsk12.add(tsk2);
		
		tsk1.setSubTasks(tsk12);
		
		Set<Task> tasks1 = new HashSet<Task>();
		tasks1.add(tsk1);
		u1.setTasks(tasks1);
		
		tenant.setCto(u1);
		
		User u2 = new User();
		u2.setName("uw2");
		u2.setRole("Developer");
		u2.setTenant(tenant);
		
		Task tsk11 = new Task();
		tsk11.setId(UUID.randomUUID().toString());
		tsk11.setParentTask(null);
		tsk11.setTaskTxt("task1 us2");
		tsk11.setUser(u2);
		
		Task tsk21 = new Task();
		tsk21.setId(UUID.randomUUID().toString());
		tsk21.setTaskTxt("subtask 1, of task1 us2");
		tsk21.setParentTask(tsk11);
		tsk21.setUser(u2);
		
		Set<Task> tssk21 = new HashSet<Task>();
		tssk21.add(tsk21);
		tsk11.setSubTasks(tssk21);
		
		Set<Task> tasks2 = new HashSet<Task>();
		tasks2.add(tsk11);
		u2.setTasks(tasks2);
		
		Set<User> users = new HashSet<User>();
		users.add(u1);
		users.add(u2);
		
		tenant.setUsers(users);
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(tenant);
		txn.commit();
		session.close();
	}
}
