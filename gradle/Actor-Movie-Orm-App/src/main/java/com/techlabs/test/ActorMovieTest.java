package com.techlabs.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.models.Actor;
import com.techlabs.models.Movie;

public class ActorMovieTest
{
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

		System.out.println(configuration);
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = factory.openSession();
		
		Movie movie1 = new Movie();
		movie1.setId(1);
		movie1.setName("movie1");
		
		Movie movie2 = new Movie();
		movie2.setId(2);
		movie2.setName("movie2");
		
		Actor actor1 = new Actor();
		actor1.setId(1);
		actor1.setName("actor1");
		Set<Movie> movies1 = new HashSet<Movie>();
		movies1.add(movie1);
		movies1.add(movie2);
		actor1.setMovies(movies1);
		
		Actor actor2 = new Actor();
		actor2.setId(2);
		actor2.setName("actor2");
		Set<Movie> movies2 = new HashSet<Movie>();
		movies2.add(movie1);
		movies2.add(movie2);
		actor2.setMovies(movies2);
		
		Transaction transaction = session.beginTransaction();
		session.save(actor1);
		session.save(actor2);
		session.save(movie1);
		session.save(movie2);
		transaction.commit();
		session.close();
	}
}
