package com.TestProduct1.Configur;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.TestProduct1.Entity.Product1;

public class Configur {
	
	public static SessionFactory getSessonFactory() {
		
		Configuration configuration= new Configuration();
		configuration.configure().addAnnotatedClass(Product1.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
		
	}

}
