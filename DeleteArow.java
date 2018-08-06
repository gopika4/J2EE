package com.delottie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteArow {

    public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	tx.begin();
	LaptopPOJO lt1=(LaptopPOJO)session.get(LaptopPOJO.class,1);
	session.delete(lt1);
	tx.commit();
	System.out.println("Deleted successfully");
    }

}
