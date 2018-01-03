import java.io.ObjectInputStream.GetField;

import org.hibernate.Session;
		import org.hibernate.SessionFactory;

		import com.mainsample.app.Coffees;
		import com.mtc.app.util.HibernateUtil;
public class TestFetch {

	public static void main(String[] args) {
	
				SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
				
				Session session = sessionFactory.openSession();
				Coffees c=session.get(Coffees.class,"sri");
				System.out.println("cofname:" +c.getCofname());
				System.out.println("sales"+c.getSales());
				System.out.println("total"+c.getTotal());
				System.out.println("price"+c.getPrice());
				 
				
				session.close();
				
				sessionFactory.close();
			}

	


	}


