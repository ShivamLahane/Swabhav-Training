package com.techlabs.tests;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.models.Customer;
import com.techlabs.models.LineItem;
import com.techlabs.models.Orders;
import com.techlabs.models.Product;

public class Test
{
	public static void main(String args[])
	{
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		
		System.out.println(configuration);
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();

		Customer customer = new Customer();
		customer.setId(3);
		customer.setName("3customer");
		System.out.println(customer);

		Orders order1 = new Orders();
		order1.setId(3);
		order1.setCustomer(customer);
		System.out.println(order1);

		Orders order2 = new Orders();
		order2.setId(4);
		order2.setCustomer(customer);
		System.out.println(order2);

		Set<Orders> ordersSet = new HashSet<Orders>();
		ordersSet.add(order1);
		ordersSet.add(order2);

		Product product1 = new Product();
		product1.setId(1);
		product1.setPrice(10);

		Product product2 = new Product();
		product2.setId(2);
		product2.setPrice(5);

		LineItem item1 = new LineItem();
		item1.setId(1);
		item1.setProduct(product1);
		item1.setOrders(order1);

		LineItem item2 = new LineItem();
		item2.setId(2);
		item2.setQuantity(14);
		item2.setProduct(product2);
		item2.setOrders(order2);

		Set<LineItem> items1 = new HashSet<LineItem>();
		items1.add(item1);
		items1.add(item2);
		order1.setLineItems(items1);
		customer.setOrders(ordersSet);

		Transaction txn = session.beginTransaction();
		session.save(customer);
		session.save(order1);
		session.save(order2);
		session.save(item2);
		session.save(item1);
		session.save(product1);
		session.save(product2);
		txn.commit();
		System.out.println("saved");
		session.close();

		session = factory.openSession();
		Query query = session.createQuery("from Orders t");
		List orders = query.list();
		System.out.println("reached");
		for (Object talent : orders)
		{
			Orders order = (Orders) talent;
			System.out.println("id : " + order.getId() + ", customer name : " + order.getCustomer().getName());
			System.out.println();
		}
		session.close();
	}
}
