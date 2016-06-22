/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Controller.RepositoryProvider;
import Models.Company;
import Models.Market;
import Models.Place;
import Models.Product;
import Models.ProductType;
import hibernate.InitSessionFactory;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DataProvider {
    
    public List<Company> GetCompanies(){
        List<Company> Companies;
        CompanyRepository CompanyRepository;
        Class<CompanyRepository> CompanyRepositoryType = CompanyRepository.class;
        CompanyRepository = RepositoryProvider.getRepository(CompanyRepositoryType);
        
        Session Session = CompanyRepository.getSession();
        Transaction Transaction = Session.beginTransaction();   
        Companies = CompanyRepository.getAll();
        Transaction.commit();
        return Companies;
    }
        
    public void SaveCompany(Company Company){
        Class<CompanyRepository> CompanyRepositoryType = CompanyRepository.class;
        Session Session = InitSessionFactory.getInstance().getCurrentSession();
        
        Transaction Transaction = Session.beginTransaction();
        RepositoryProvider.getRepository(CompanyRepositoryType).save(Company);
        Transaction.commit();
    }
    
    public List<Market> GetMarkets(){
        List<Market> Markets;
        MarketRepository MarketRepository;
        Class<MarketRepository> MarketRepositoryType = MarketRepository.class;
        MarketRepository = RepositoryProvider.getRepository(MarketRepositoryType);
        
        Session Session = MarketRepository.getSession();
        Transaction Transaction = Session.beginTransaction();        
        Markets = MarketRepository.getAll();
        Transaction.commit();
        return Markets;
    }
    
    public void SaveMarket(Market Market){
        Class<MarketRepository> MarketRepositoryType = MarketRepository.class;
        Session Session = InitSessionFactory.getInstance().getCurrentSession();
        
        Transaction Transaction = Session.beginTransaction();
        RepositoryProvider.getRepository(MarketRepositoryType).save(Market);
        Transaction.commit();
    }
    
    public List<Product> GetProducts(){
        List<Product> Products;
        ProductRepository ProductRepository;
        Class<ProductRepository> ProductRepositoryType = ProductRepository.class;
        ProductRepository = RepositoryProvider.getRepository(ProductRepositoryType);
        
        Session Session = ProductRepository.getSession();
        Transaction Transaction = Session.beginTransaction();        
        Products = ProductRepository.getAll();
        Transaction.commit();
        return Products;
    }    
    
    public List<Product> GetProductsByNumber(String ProductNumber){
        List<Product> Products;
        ProductRepository ProductRepository;
        Class<ProductRepository> ProductRepositoryType = ProductRepository.class;
        ProductRepository = RepositoryProvider.getRepository(ProductRepositoryType);
        
        Session Session = ProductRepository.getSession();
        Transaction Transaction = Session.beginTransaction();        
        Products = ProductRepository.getByProductNumber(ProductNumber);
        Transaction.commit();
        return Products;
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
    
    public List<ProductType> GetProductTypes(){
        List<ProductType> ProductTypes;
        ProductTypeRepository ProductTypeRepository;
        Class<ProductTypeRepository> ProductTypeRepositoryType = ProductTypeRepository.class;
        ProductTypeRepository = RepositoryProvider.getRepository(ProductTypeRepositoryType);
        Transaction Transaction;
        
        Session Session = ProductTypeRepository.getSession();
        Transaction = Session.beginTransaction();  
        ProductTypes = ProductTypeRepository.getAll();
        Transaction.commit();
        return ProductTypes;
    }  
    
    public void SaveProductType(ProductType ProductType){
        Class<ProductTypeRepository> ProductTypeRepositoryType = ProductTypeRepository.class;
        Session Session = InitSessionFactory.getInstance().getCurrentSession();
        
        Transaction Transaction = Session.beginTransaction();
        RepositoryProvider.getRepository(ProductTypeRepositoryType).save(ProductType);
        Transaction.commit();
    }
    
    public Product GetProductsById(UUID id){
        Product Product;
        ProductRepository ProductRepository;
        Class<ProductRepository> ProductRepositoryType = ProductRepository.class;
        ProductRepository = RepositoryProvider.getRepository(ProductRepositoryType);
        
        Session Session = ProductRepository.getSession();
        Transaction Transaction = Session.beginTransaction();        
        Product = ProductRepository.getByID(id);
        Transaction.commit();
        return Product;
    }  
    
}
