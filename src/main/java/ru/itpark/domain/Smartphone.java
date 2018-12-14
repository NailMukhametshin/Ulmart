package ru.itpark.domain;

public class Smartphone extends Product {

    private String brand;
    private int displaySize;

    public Smartphone(int id, String name, int price, String category, String brand, int displaySize) {
        super(id, name, price, category);
        this.brand = brand;
        this.displaySize = displaySize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }
}
