package hibernate;

import java.io.InputStream;
import java.net.URL;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class InitSessionFactory {

    private static org.hibernate.SessionFactory sessionFactory;
        
    private static ServiceRegistry serviceRegistry;
  
    private static SessionFactory configureSessionFactory() throws HibernateException {
        URL url = InitSessionFactory.class.getResource("/hibernate/hibernate.cfg.xml");
        InputStream in = HibernateUtil.class.getResourceAsStream(url.getFile());
        Configuration configuration = new Configuration().configure();
        serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();        
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
    
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
        
    static{
        try{
            sessionFactory = configureSessionFactory();
        }catch(HibernateException exception){
            System.out.println("Problem creating session factory");
            exception.printStackTrace();
        }  
    }

    public static SessionFactory getInstance() {
        return sessionFactory;
    }

    public InitSessionFactory() {
    }

    public static Session openSession() {
        return sessionFactory.openSession();
    }

    public static Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public static void close(){
        if (sessionFactory != null)
        sessionFactory.close();
	sessionFactory = null;
    }
}
