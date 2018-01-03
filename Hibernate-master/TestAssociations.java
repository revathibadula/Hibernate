
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.actionbazaar.persistence.Bid;
import com.actionbazaar.persistence.Item;
import com.mtc.app.util.HibernateUtil;

public class TestAssociations {

	public static void main(String[] args) {

		Item item = new Item(111L,"iPhone7",new Date(),new BigDecimal(300),new Date(),new Date());
		
		Bid bid1 = new Bid(99901L,new BigDecimal(200),new Date());	
		
		Bid bid2 = new Bid(99902L,new BigDecimal(210),new Date());
		
		Set<Bid> bids = new HashSet<Bid>();
		
		bids.add(bid1);
		bids.add(bid2);
		
		item.setBids(bids);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
			session.save(item);
			
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();
	


	}

}
