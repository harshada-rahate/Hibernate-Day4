package com.singleResult;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test2 {
	public static void main(String [] args)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		String hql="from Student where id=3";
		//String hql="from Student where id=1? ";
		
		Query<Student>query = session.createQuery(hql,Student.class);
		
				
				List<Student> list= query.getResultList();
				for(Student student:list)
				{
					System.out.println(student.getId()+""+student.getName());
				}
				
				 
				
		       
		
	}

}
