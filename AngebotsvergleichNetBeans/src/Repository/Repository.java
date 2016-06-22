package Repository;

import Models.Company;
import Models.IEntity;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Repository<T extends IEntity> implements IRepository<T>{
    
    private Session session;
    private Class<T> classType;

    public void setSession(Session session) {
        this.session = session;
    }

    public Session getSession() {
        return session;
    }
    
    public Repository(Class<T> classType){
        this.classType = classType;
    }
    
    public List<T> getAll() {
        return session.createCriteria(classType).list();
    }
    
    public T getById(UUID id) {
        return (T) session.createCriteria(classType).
                add(Restrictions.eq("id", id)).
                list().get(0);
    }

    @Override
    public void save(IEntity entity) {
        session.saveOrUpdate(entity);
    }
    
    
}