package com.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.binder.HibernateSession;
import com.hibernate.pojo.Employee;

public class TestVersionExample {
	public static void main(String[] args) {

//		save();
		update();
		
		
	}

	private static void update() {
		
		Session session = HibernateSession.getHibernateSession();
		Transaction txns = session.beginTransaction();
		Query q = session.createQuery(" from Employee ");
		Employee emp = (Employee) q.list().get(1);
		
		System.out.println("Emp before update :   "+emp.toString());
		emp.setEmpDepartment("QA-testing");
		System.out.println("Emp after update :::   "+emp.toString());
		txns.commit();
		
		HibernateSession.closedConnection();
	}

	private static void save() {
		Session session = HibernateSession.getHibernateSession();
		Transaction txn = session.beginTransaction();
		
		Employee emp = new Employee();
		
		emp.setEmpName("Amit");
		emp.setEmpDepartment("server");
		
		session.save(emp);
		txn.commit();
		HibernateSession.closedConnection();
		
	}
}
