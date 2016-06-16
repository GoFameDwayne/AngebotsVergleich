package Models;


import java.util.UUID;

public class Place implements IEntity {
    private UUID ID;
    private String Street;
    private String ZipCode;
    private String City;

    @Override
    public UUID getID() {
        return ID;
    }

    @Override
    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
}
