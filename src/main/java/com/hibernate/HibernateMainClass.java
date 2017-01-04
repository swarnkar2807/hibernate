package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.binder.HibernateSession;
import com.hibernate.pojo.Employee;

public class HibernateMainClass {

	public static void main(String[] a){
		HibernateMainClass hbm= new HibernateMainClass();
		hbm.saveObject();
		
//		hbm.getObject();
	}
	
	public void saveObject(){
		Session session = HibernateSession.getHibernateSession();
		Transaction txn = session.beginTransaction();
		
//		Employee emp = new Employee();
		annotation.hibernate.Employee emp = new annotation.hibernate.Employee();
		
		emp.setEmpName("Sanjay");
		emp.setEmpDepartment("server");
		
		session.save(emp);
		txn.commit();
//		session.close();
		HibernateSession.closedConnection();
	}
	
	public void getObject(){
		
		Session session = HibernateSession.getHibernateSession();
		
		Object o = session.load(Employee.class, 2);
		
		System.out.println("Employee object - "+((Employee)o).toString());
		HibernateSession.closedConnection();
		
	}
}


