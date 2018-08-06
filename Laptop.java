package com.delottie;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class Laptop {

    public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory sf=config.buildSessionFactory();
	Session session=sf.openSession();
	LaptopPOJO l1=new LaptopPOJO();
	l1.setBrandname("DELL");
	l1.setLid(2);
	l1.setPrice(30000.00);
	Transaction tx=session.beginTransaction();
	tx.begin();
	session.save(l1);
	tx.commit();
	System.out.println("Successfully inserted");
	
    }

}
