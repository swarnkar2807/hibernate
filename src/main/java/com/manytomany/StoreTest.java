package com.manytomany;


import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.binder.HibernateSession;  


public class StoreTest {  
	public static void main(String[] args) {  
		
		Session session= HibernateSession.getHibernateSession();
		Transaction tx=session.beginTransaction();  

		HashMap<String,User> map1=new HashMap<String,User>();  
		map1.put("java is a programming language",  
				new User("John Milton","john@gmail.com","usa"));  

		map1.put("java is a platform",  
				new User("Ashok Kumar","ashok@gmail.com","india"));  

		HashMap<String,User> map2=new HashMap<String,User>();  
		map2.put("servlet technology is a server side programming",  

				new User("John Milton","john@gmail.com","usa"));  
		map2.put("Servlet is an Interface",  
				new User("Ashok Kumar","ashok@gmail.com","india"));  

		Question question1=new Question("What is java?",map1);  
		Question question2=new Question("What is servlet?",map2);  

		session.persist(question1);  
		session.persist(question2);  

		tx.commit();  
		HibernateSession.closedConnection();  
		System.out.println("successfully stored");  
	}  
}