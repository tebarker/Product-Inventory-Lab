package models;

public class Planner {
    private int id;
    private String type;
    private String brand;
    private int size;
    private int qty;
    private float price;

    public Planner(int id, String type, String brand, int size, int qty, double price) {
    }

    public Planner() {

    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String expectedBrand) {
        this.brand= brand;
    }
}
