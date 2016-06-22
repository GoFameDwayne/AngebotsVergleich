package Controller;

import Models.Product;
import Models.ProductCompare;
import Repository.DataProvider;

public class ProductCompareController {
    private DataProvider DataProvider;
    private Product Product1;
    private Product Product2;
    private ProductCompare ProductCompare;
    private double PricePercentage1;
    private double PricePercentage2;
    
    public ProductCompareController(DataProvider dataProvider){
        this.DataProvider = dataProvider;
        ProductCompare = new ProductCompare();
    }

    public DataProvider getDataProvider() {
        return DataProvider;
    }

    public void setDataProvider(DataProvider DataProvider) {
        this.DataProvider = DataProvider;
    }    

    public Product getProduct1() {
        return Product1;
    }

    public void setProduct1(Product Product1) {
        this.Product1 = Product1;
    }

    public Product getProduct2() {
        return Product2;
    }

    public void setProduct2(Product Product2) {
        this.Product2 = Product2;
    }

    public ProductCompare getProductCompare() {
        return ProductCompare;
    }

    public void setProductCompare(ProductCompare ProductCompare) {
        this.ProductCompare = ProductCompare;
    }

    public double getPricePercentage1() {
        return PricePercentage1;
    }

    public void setPricePercentage1(double PricePercentage1) {
        this.PricePercentage1 = PricePercentage1;
    }

    public double getPricePercentage2() {
        return PricePercentage2;
    }

    public void setPricePercentage2(double PricePercentage2) {
        this.PricePercentage2 = PricePercentage2;
    }
    
    public Product getBetterProduct(){        
        PricePercentage1 = ProductCompare.getPricePercentage(Product1.getAmount(), Product2.getAmount());
        PricePercentage2 = ProductCompare.getPricePercentage(Product2.getAmount(), Product1.getAmount());
        
        if(PricePercentage1 > PricePercentage2){
            return Product1;
        }else if(PricePercentage1 < PricePercentage2){
            return Product2;
        }else{
            return null;
        }
    }
    
}