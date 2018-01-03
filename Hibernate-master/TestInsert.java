
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Hibernate;
		import org.hibernate.Session;
		import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.actionbazaar.persistence.Bid;
import com.mainsample.app.Coffees;
import com.mainsample.app.Suppliers;
import com.mtc.app.util.HibernateUtil;
public class TestInsert {
public static void main(String[] args) {
		

			
	            Coffees c= new Coffees("bhavana",9,0,0);
	            
				SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
				
				Session session = sessionFactory.openSession();
				Transaction transaction = session.getTransaction();
			
				
				transaction.begin();
				
				session.save(c);
				
			transaction.commit();
			
			session.close();
			
			sessionFactory.close();
}
}



