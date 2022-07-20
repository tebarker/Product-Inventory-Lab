package models;

public class Journal {
    private int id;
    private String type;
    private String brand;
    private int size;
    private int qty;
    private double price;

    public Journal(){}
    public Journal (int id, String type, String brand, int size, int qty, double price){
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.qty = qty;
        this.price = price;

    }


    public void setBrand(String brand ) {
        this.brand = brand;
    }

    public String getBrand() { return brand;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setSize(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getQty() {
        return qty;
    }

    public void setPrice(){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

