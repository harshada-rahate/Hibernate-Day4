package com;

import org.hibernate.Session;

public class Test {
   public static  void main(String [] args)
   {
	   
   
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	         Student s=new Student();
	         s.setId(1);
	         s.setName("nk");
	         
	         Student s1=new Student();
	        
	          s1.setId(2);
	           s1.setName("pk");
	          session.persist(s);
	          session.persist(s1);
	          
	          session.beginTransaction().commit();
	         
   }	          
	
}
