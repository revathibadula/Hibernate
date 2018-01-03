package com.mtc.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.actionbazaar.persistence.Bid;
import com.actionbazaar.persistence.Item;
import com.classicmodels.app.Employees;
import com.mainsample.app.Coffees;
import com.mainsample.app.Suppliers;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static{
		
		Configuration configuration = new Configuration();
		
		//Loads hibernate.cfg.xml
		configuration.configure();
		
//		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(Coffees.class);
		//configuration.addAnnotatedClass(Suppliers.class);
		//configuration.addAnnotatedClass(Employees.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}