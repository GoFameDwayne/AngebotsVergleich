package Models;


import java.util.UUID;

public class Product implements IEntity {
    private UUID ID;
    private String Description;
    private Market Market;
    private String ProductNumber;
    private double Amount;
    private ProductType ProductType;
    private int AmountTypeInt;

    public int getAmountTypeInt() {
        return AmountTypeInt;
    }

    public void setAmountTypeInt(int AmountTypeInt) {
        this.AmountTypeInt = AmountTypeInt;
    }
    private Company Company;
    
    public enum AmountType{
        euro,
        dollar
    }
    
    public Product(){
        
    }
    public Product(UUID ID, String description) {
        this.ID = ID;
        this.Description = description;
    }

    @Override
    public UUID getID() {
        return ID;
    }
    
    @Override
    public void setID(UUID ID) {
        this.ID = ID;
    }

    public ProductType getProductType() {
        return ProductType;
    }

    public void setProductType(ProductType ProductType) {
        this.ProductType = ProductType;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Market getMarket() {
        return Market;
    }

    public void setMarket(Market Market) {
        this.Market = Market;
    }

    public String getProductNumber() {
        return ProductNumber;
    }

    public void setProductNumber(String ProductNumber) {
        this.ProductNumber = ProductNumber;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public Company getCompany() {
        return Company;
    }

    public void setCompany(Company Company) {
        this.Company = Company;
    }   
    
    public String toString(){
        return getProductNumber();
    }
    
}
