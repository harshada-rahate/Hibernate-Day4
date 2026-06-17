package com.singleResult;

import org.hibernate.Session;
import org.hibernate.query.Query;



public class Test3 {
	public static void main(String [] args)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		    String hql="from Student where id=?1";//positional parameter
		    Query<Student> query =session.createQuery(hql,Student.class);
		       
		    query.setParameter(1, 2);
		    
		    Student student=query.getSingleResult();
		    System.out.println(student.getId()+""+student.getName());
		    
		         
		
	}

}
