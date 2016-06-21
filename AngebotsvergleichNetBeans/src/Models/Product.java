package Models;


import java.util.UUID;

public class Product implements IEntity {
    private UUID ID;
    private String Description;
    private Market Market;
    private String ProductNumber;
    private double Amount;
    private Company Company;
    
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
    
    public String ToString()
    {
        System.out.println("11");
        String ausgabe = "Direkt-Vergleich \n\n";
        if(Description != null)
        {
            ausgabe += "Bezeichnung: " + Description + "\n";
        }
        if(ProductNumber != null)
        {
            ausgabe += "Priduktnummer:" + ProductNumber + " \n";
        }
        if(Market != null)
        {
            ausgabe += "Markt: " + Market.getName() + "\n";
        }
        return ausgabe;
    }
}
