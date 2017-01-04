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
		
		Query query = session.createQuery("from QuestionList");
		List<QuestionList> list=query.list(); 
		
		
		Iterator<QuestionList> itr=list.iterator();  
	    while(itr.hasNext()){  
	    	QuestionList q=itr.next();  
	        System.out.println("\nQuestion Name: "+q.getqName());  
	          
	        //printing answers  
	        List<String> list2=q.getAnswer();  
	        
	        System.out.println(list2.toString());
//	        Iterator<String> itr2=list2.iterator();  
//	        while(itr2.hasNext()){  
//	            System.out.println(itr2.next());  
//	        }  
	          
	    }  
	    
	    HibernateSession.closedConnection();
	    System.out.println("success");  
	    
	    
	}

	private static void saveObject() {
Session session= HibernateSession.getHibernateSession();
		
		Transaction txns = session.beginTransaction();
		QuestionList q = new QuestionList();
		List<String> ans = new ArrayList<String>();
		ans.add("not support...........");
		ans.add("support........");
		q.setqName("JAVA is support oops...............");
		q.setAnswer(ans);
		System.out.println("***  "+q.toString());
		session.save(q);
		txns.commit();
		HibernateSession.closedConnection();
		
	}
	
}
