package ua.training.model.entity;

public class Car {
    private int id;
    private String model;
    private long price;

    private Manufacturer manufacturer;

    public Car() {
    }
    public Car(int id, String model, long price, Manufacturer manufacturer) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
