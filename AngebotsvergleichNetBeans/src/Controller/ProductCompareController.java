package Controller;

import Models.Company;
import Repository.CompanyRepository;
import Repository.IRepository;
import hibernate.DbSessionFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductCompareController {
    private DbSessionFactory SessionFactory;
    //private List<IRepository> Repositories;
    
    public List<Company> GetCompany(){
        SessionFactory = new DbSessionFactory();
        CompanyRepository CompanyRepository1;
        //Class<CompanyRepository> CompanyRepositoryType = CompanyRepository.class;
        CompanyRepository1 = new CompanyRepository();
        CompanyRepository1.setSession(SessionFactory.getCurrentSession());
        //CompanyRepository1 = getRepository(CompanyRepositoryType);
        
        return CompanyRepository1.getAll();
    }
    
    private <T extends IRepository> T getRepository(Class<T> classType){
        T Repository = null;
        try {
            Repository = classType.newInstance();
            Repository.setSession(SessionFactory.getCurrentSession());
        } catch (Exception ex) {
            Logger.getLogger(ProductCompareController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Repository;
    }
    
}
