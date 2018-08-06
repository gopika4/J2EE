package com.delottie;
import java.util.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class WhereRow {

    public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	Criteria c=session.createCriteria(LaptopPOJO.class);
	c.add(Restrictions.gt("price", 30000.0));
	
	List listObj=c.list();
	Iterator it=listObj.iterator();
	while(it.hasNext())
	{
	    LaptopPOJO lt=(LaptopPOJO)it.next();
	    System.out.println(lt.getLid()+" "+lt.getBrandname()+" "+lt.getPrice());
	}

    }

}
