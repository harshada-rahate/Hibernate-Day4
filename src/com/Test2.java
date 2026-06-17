package com;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.query.Query;

public class Test2 {

	public static void main(String [] args)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		 // sql= select * from student
		  //hql=
		String hql="from Student ";
		
		  
		Query<Student> query= session.createQuery(hql,Student.class); //query object
		
		     List <Student>list= query.getResultList();
		     
		     for(Student student:list)
		     {
		    	 System.out.println(student.getId()+"  "+student.getName());
		     }
		     
		     ///////////retrieve data////////////// 
		     
		     
		    		         
		 
		 
		
	}
	
	
}
