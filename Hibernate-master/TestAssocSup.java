

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mainsample.app.Coffees;
import com.mainsample.app.Suppliers;
import com.mtc.app.util.HibernateUtil;

public class TestAssocSup {

	public static void main(String[] args) {
Coffees c1 = new Coffees("latte",19,0,0);
Coffees c2 = new Coffees("lasd",16,0,0);
Suppliers s = new Suppliers(125,"john","franklin","kansas","mo",64093);	 

Set<Coffees> cof = new HashSet<Coffees>();


	cof.add(c1);
	cof.add(c2);
	s.setCof(cof);
	
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
			session.save(s);
			
			transaction.commit();
			session.close();
		
		sessionFactory.close();

	}

}
