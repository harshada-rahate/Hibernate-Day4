package com.singleResult;

import org.hibernate.Session;

public class Test {
   public static  void main(String [] args)
   {
	   
   
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	         Student s=new Student();
	         s.setId(3);
	         s.setName("kk");
	         
	         Student s1=new Student();
	        
	          s1.setId(4);
	           s1.setName("pp");
	          session.persist(s);
	          session.persist(s1);
	          
	          session.beginTransaction().commit();
	         
   }	          
	
}
