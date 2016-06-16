package Repository;

import java.util.List;
import java.util.UUID;
import org.hibernate.Session;

public interface IRepository<T> {
    void setSession(Session session);
    List<T> getAll();
    T getById(UUID id);
}
