package Repository;

import Models.*;
import java.util.List;
import java.util.UUID;
import org.hibernate.criterion.Restrictions;

public class ProductRepository extends Repository<Product>{

    public ProductRepository() {
        super(Product.class);
    }
    
    public List<Product> getByProductNumber(String ProductNumber) {
        return this.getSession().createCriteria(Product.class).
                add(Restrictions.
                        like("ProductNumber", "%" + ProductNumber + "%")).list();

    }
    
    public Product getByID(UUID id) {
        return super.getById(id);
    }
    
}
