package com.delottie;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SelectArow {

    public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	Query query=session.createQuery("from com.delottie.LaptopPOJO");
	java.util.List listObj=query.list();
	Iterator it=listObj.iterator();
	while(it.hasNext())
	{
	    LaptopPOJO lt=(LaptopPOJO)it.next();
	    System.out.println(lt.getLid()+" "+lt.getBrandname()+" "+lt.getPrice());
	}
	    
	
    }

}
