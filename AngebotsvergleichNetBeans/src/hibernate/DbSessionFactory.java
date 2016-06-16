package hibernate;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class DbSessionFactory {

  private static org.hibernate.SessionFactory sessionFactory;

	public DbSessionFactory() {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	static{
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        }

	public static org.hibernate.SessionFactory getInstance() {
		return sessionFactory;
	}

	public Session openSession() {
		return sessionFactory.openSession();
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public static void close(){
		if (sessionFactory != null)
			sessionFactory.close();
		sessionFactory = null;
	
	}
}
