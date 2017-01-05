package hibernate.collection.listmapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.binder.HibernateSession;

public class TestListMapping {

	public static void main(String[] args) {
//		saveObject();
		loadObject();
	}

	private static void loadObject() {
		Session session = HibernateSession.getHibernateSession();
		
		Query query = session.createQuery("from Questions");
		List<Questions> list=query.list(); 
		
		
		Iterator<Questions> itr=list.iterator();  
	    while(itr.hasNext()){  
	    	Questions q=itr.next();  
	        System.out.println("\nQuestion Name: "+q.getqName());  
	          
	        List<Answers> list2=q.getAnswer();  
	        
	        System.out.println(list2.toString());
	          
	    }  
	    
	    HibernateSession.closedConnection();
	    System.out.println("success");  
	    
	    
	}

	private static void saveObject() {
Session session= HibernateSession.getHibernateSession();
		
		Transaction txns = session.beginTransaction();
		Questions q = new Questions();
		q.setqName("What is JAVA");
		Answers ans1 = new Answers();
		ans1.setAnsString("JAVA is programing language");
		ans1.setPosterName("posted by Sanjay");
		
		Answers ans2 = new Answers();
		ans2.setAnsString("JAVA is a platform independent");
		ans2.setPosterName("posted by Haresh");
		
		Answers ans3 = new Answers();
		ans3.setAnsString("JAVA is object oriented programing language");
		ans3.setPosterName("posted by Amit");
		
		List<Answers> ans = new ArrayList<Answers>();
		ans.add(ans3);
		ans.add(ans2);
		ans.add(ans1);
		q.setAnswer(ans);
		
		System.out.println("***  "+q.toString());
		session.save(q);
		txns.commit();
		HibernateSession.closedConnection();
		
	}
	
}
