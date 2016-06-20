package Models;


import java.util.List;
import java.util.UUID;

public class Market implements IEntity{
    private UUID ID;
    private String Name;
    private Place Place;
    private List<Product> Products;

    @Override
    public UUID getID() {
        return ID;
    }

    @Override
    public void setID(UUID ID) {
        this.ID = ID;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> Products) {
        this.Products = Products;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Place getPlace() {
        return Place;
    }

    public void setPlace(Place Place) {
        this.Place = Place;
    }

}
