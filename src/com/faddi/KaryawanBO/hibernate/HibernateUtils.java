package com.faddi.KaryawanBO.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

private static SessionFactory session = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() throws HibernateException {
		return new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory session() {
		return session;
	}
	
}
