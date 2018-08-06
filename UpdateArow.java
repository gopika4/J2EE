package com.delottie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateArow {

    public static void main(String[] args) {
	
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		tx.begin();
		LaptopPOJO lt1=(LaptopPOJO)session.get(LaptopPOJO.class,2);
		lt1.setBrandname(lt1.getBrandname()+" India");
		session.update(lt1);
		tx.commit();
		System.out.println("Update successfully");
	    }

	}

    
