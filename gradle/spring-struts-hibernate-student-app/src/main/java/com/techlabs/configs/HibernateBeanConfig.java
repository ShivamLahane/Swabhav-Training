package com.techlabs.configs;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;


public class HibernateBeanConfig
{
	@Bean
	public SessionFactory sessionFactory() 
	{
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		return cfg.buildSessionFactory();
	}
}