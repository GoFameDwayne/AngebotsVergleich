package Models;


import java.util.UUID;

public class ProductType implements IEntity{
    private UUID ID;
    private String Name;
    
    @Override
    public UUID getID() {
        return ID;
    }

    @Override
    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String toString(){
        return getName();
    }
}
