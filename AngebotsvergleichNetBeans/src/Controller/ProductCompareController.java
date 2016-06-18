package Controller;

import hibernate.InitSessionFactory;
import Models.*;
import Repository.CompanyRepository;
import Repository.IRepository;
import hibernate.DbSessionFactory;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductCompareController {
    private Session Session;
    //private List<IRepository> Repositories;
    
    public ProductCompareController(){
        Session = InitSessionFactory.getInstance().getCurrentSession();
    }
    
    public List<Company> GetCompany(){
        Class<CompanyRepository> CompanyRepositoryType = CompanyRepository.class;
        Transaction Transaction = Session.beginTransaction();
        
        Company comp = new Company();
        Place place = new Place();
        place.setCity("City");
        place.setID(UUID.randomUUID());
        place.setStreet("street");
        place.setZipCode("35485");
        
        comp.ID = UUID.randomUUID();
        comp.setName("companyname");
        comp.setPlace(place);
        
        getRepository(CompanyRepositoryType).save(comp);
        Transaction.commit();
        return getRepository(CompanyRepositoryType).getAll();
    }
    
    private <T extends IRepository> T getRepository(Class<T> classType){
        T Repository = null;
        try {
            Repository = classType.newInstance();
            Repository.setSession(Session);
        } catch (Exception ex) {
            Logger.getLogger(ProductCompareController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Repository;
    }
    
}
