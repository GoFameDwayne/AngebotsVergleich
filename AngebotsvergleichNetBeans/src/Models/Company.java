package Models;


import java.util.UUID;

public class Company implements IEntity{
    public UUID ID;
    private String Name;
    private Place Place;

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

    public Place getPlace() {
        return Place;
    }

    public void setPlace(Place Place) {
        this.Place = Place;
    }
}
