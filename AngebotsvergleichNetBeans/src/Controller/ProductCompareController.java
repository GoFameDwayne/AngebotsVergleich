package Controller;

import hibernate.InitSessionFactory;
import Models.*;
import Repository.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductCompareController {
    
    public ProductCompareController(){
    }
    
    public List<Company> GetCompanies(){
        CompanyRepository CompanyRepository;
        Class<CompanyRepository> CompanyRepositoryType = CompanyRepository.class;
        CompanyRepository = RepositoryProvider.getRepository(CompanyRepositoryType);
        
        Session Session = CompanyRepository.getSession();
        Session.beginTransaction();        
        return CompanyRepository.getAll();
    }
        
    public void SaveCompany(Company Company){
        Class<CompanyRepository> CompanyRepositoryType = CompanyRepository.class;
        Session Session = InitSessionFactory.getInstance().getCurrentSession();
        
        Transaction Transaction = Session.beginTransaction();
        RepositoryProvider.getRepository(CompanyRepositoryType).save(Company);
        Transaction.commit();
    }
    
    public List<Market> GetMarkets(){
        MarketRepository MarketRepository;
        Class<MarketRepository> MarketRepositoryType = MarketRepository.class;
        MarketRepository = RepositoryProvider.getRepository(MarketRepositoryType);
        
        Session Session = MarketRepository.getSession();
        Session.beginTransaction();        
        return MarketRepository.getAll();
    }
    
    public void SaveMarket(Market Market){
        Class<MarketRepository> MarketRepositoryType = MarketRepository.class;
        Session Session = InitSessionFactory.getInstance().getCurrentSession();
        
        Transaction Transaction = Session.beginTransaction();
        RepositoryProvider.getRepository(MarketRepositoryType).save(Market);
        Transaction.commit();
    }
    
    public List<Product> GetProducts(){
        ProductRepository ProductRepository;
        Class<ProductRepository> ProductRepositoryType = ProductRepository.class;
        ProductRepository = RepositoryProvider.getRepository(ProductRepositoryType);
        
        Session Session = ProductRepository.getSession();
        Session.beginTransaction();        
        return ProductRepository.getAll();
    }    

    public void SaveProduct(Product Product){
        Class<ProductRepository> ProductRepositoryType = ProductRepository.class;
        Session Session = InitSessionFactory.getInstance().getCurrentSession();
        
        Transaction Transaction = Session.beginTransaction();
        RepositoryProvider.getRepository(ProductRepositoryType).save(Product);
        Transaction.commit();
    }
    
    public List<Place> GetPlaces(){
        List<Place> Places;
        PlaceRepository PlaceRepository;
        Class<PlaceRepository> PlaceRepositoryType = PlaceRepository.class;
        PlaceRepository = RepositoryProvider.getRepository(PlaceRepositoryType);
        Transaction Transaction;
        
        Session Session = PlaceRepository.getSession();
        Transaction = Session.beginTransaction();  
        Places = PlaceRepository.getAll();
        Transaction.commit();
        return Places;
    }    

    public void SavePlace(Place Place){
        Class<PlaceRepository> PlaceRepositoryType = PlaceRepository.class;
        Session Session = InitSessionFactory.getInstance().getCurrentSession();
        
        Transaction Transaction = Session.beginTransaction();
        RepositoryProvider.getRepository(PlaceRepositoryType).save(Place);
        Transaction.commit();
    }
    
}