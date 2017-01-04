package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.binder.HibernateSession;
import com.hibernate.pojo.ContractEmployee;
import com.hibernate.pojo.Employee;
import com.hibernate.pojo.RegularEmployee;
//
//import annotation.hibernate.ContractEmployee;
//import annotation.hibernate.Employee;
//import annotation.hibernate.RegularEmployee;


public class AnnotationHibernateMainClass {

	public static void main(String[] args){
		
//		saveObject();
		
		getObject();
	}

	private static void getObject() {
		
		Session session = HibernateSession.getHibernateSession();
		Object o = session.load(RegularEmployee.class, 2);
		System.out.println("\n\n"+((RegularEmployee)o).toString());
		
		HibernateSession.closedConnection();
	}

	private static void saveObject() {
		
		Session seesion = HibernateSession.getHibernateSession();
		 Transaction txn = seesion.beginTransaction();
		 
		 Employee emp = new Employee();
		 emp.setEmpDepartment("QA");
		 emp.setEmpName("hares4h");
		 
		 RegularEmployee regEmp = new RegularEmployee();
		 regEmp.setEmpBonus(1000);
		 regEmp.setEmpDepartment("Client");
		 regEmp.setEmpName("Rahul4");
		 regEmp.setEmpSalary(10000);

		 ContractEmployee contEmp = new ContractEmployee();
		 contEmp.setEmpDurationInMonth(10);
		 contEmp.setEmpDepartment("Client");
		 contEmp.setEmpName("Rahul 41");
		 contEmp.setEmpPayPerHour(10000);
		 
		 seesion.save(emp);
		 seesion.save(regEmp);
		 seesion.save(contEmp);
		 txn.commit();
		 HibernateSession.closedConnection();
		 
	}
}
