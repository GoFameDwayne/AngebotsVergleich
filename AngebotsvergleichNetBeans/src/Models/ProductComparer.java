package Models;


import java.util.ArrayList;

public class ProductComparer {
    private ArrayList<Market> Markets;
    private ArrayList<Company> Companys;
    private ArrayList<Place> Places;
    private ArrayList<Product> Products;
    private ArrayList<ProductType> ProductTypes;

    public ArrayList<Market> getMarkets() {
        return Markets;
    }

    public void setMarkets(ArrayList<Market> Markets) {
        this.Markets = Markets;
    }

    public ArrayList<Company> getCompanys() {
        return Companys;
    }

    public void setCompanys(ArrayList<Company> Companys) {
        this.Companys = Companys;
    }

    public ArrayList<Place> getPlaces() {
        return Places;
    }

    public void setPlaces(ArrayList<Place> Places) {
        this.Places = Places;
    }

    public ArrayList<Product> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Product> Products) {
        this.Products = Products;
    }

    public ArrayList<ProductType> getProductTypes() {
        return ProductTypes;
    }

    public void setProductTypes(ArrayList<ProductType> ProductTypes) {
        this.ProductTypes = ProductTypes;
    }
}
