package hibernate.component;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.binder.HibernateSession;
import com.manytomany.Question;

public class ComponentTest {

	public static void main(String[] args) {
		
//	saveObject();	
	fatchObject();
	}

	private static void fatchObject() {
		Session session = HibernateSession.getHibernateSession();

		Query query =session.createQuery("from Employee");
		List<Employee> emplist = query.list();
		
		Iterator<Employee> it = emplist.iterator();
		
		while(it.hasNext())
			System.out.println(it.next().toString());
		
		
	}

	private static void saveObject() {
		Session session = HibernateSession.getHibernateSession();
		Transaction txns =  session.beginTransaction();
		
		Employee emp = new Employee();
		Address add = new Address();
		
		add.setCity("Indore");
		add.setCountry("India");
		add.setPincode(452001);
		emp.setName("Sanjay");
		emp.setAddress(add);
		
		Employee emp1 = new Employee();
		Address add1 = new Address();
		
		add1.setCity("Rajasthan");
		add1.setCountry("Udaipur");
		add1.setPincode(312402);
		emp1.setName("Vijay");
		emp1.setAddress(add1);
		
		session.save(emp);
		session.save(emp1);
		
		txns.commit();
		HibernateSession.closedConnection();
		
	}
	
	
}
