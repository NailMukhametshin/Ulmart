package ru.itpark.domain;

public class Computer extends Product{

    private String graphic;
    private String base;

    public Computer(int id, String name, int price, String category, String graphic, String base) {
        super(id, name, price, category);
        this.graphic = graphic;
        this.base = base;
    }

    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
