package ru.itpark.domain;

public class Pot extends Product {

    private String colour;
    private int childrenAge;

    public Pot(int id, String name, int price, String category, String colour, int childrenAge) {
        super(id, name, price, category);
        this.colour = colour;
        this.childrenAge = childrenAge;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getChildrenAge() {
        return childrenAge;
    }

    public void setChildrenAge(int childrenAge) {
        this.childrenAge = childrenAge;
    }
}
