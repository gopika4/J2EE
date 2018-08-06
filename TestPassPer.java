package com.delottie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPassPer {

    public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg1.xml");
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	Passport pp=new Passport();
	pp.setPpid(1);
	pp.setPpname("India");
	Person p=new Person();
	p.setName("Guru");
	p.setPassportno(pp);
	p.setPid(1);
	Transaction tx=session.beginTransaction();
	session.save(pp);
	session.save(p);
	tx.commit();
	System.out.println("DONE");

    }

}
