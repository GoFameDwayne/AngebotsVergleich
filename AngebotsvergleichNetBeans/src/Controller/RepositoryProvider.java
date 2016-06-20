package Controller;
import Repository.IRepository;
import hibernate.InitSessionFactory;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

public class RepositoryProvider {
    private static Session Session;
        
    static{
    }
    
    public static <T extends IRepository> T getRepository(Class<T> classType){
        T Repository = null;
        try {
            Repository = classType.newInstance();
            Repository.setSession(InitSessionFactory.getInstance().getCurrentSession());
        } catch (Exception ex) {
            Logger.getLogger(ProductCompareController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Repository;
    }
    
}
