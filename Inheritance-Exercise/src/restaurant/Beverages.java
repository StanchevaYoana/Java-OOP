package restaurant;


import java.math.BigDecimal;

public class Beverages extends Product {
    private double millimeters;

    public Beverages(String name, BigDecimal price, double millimeters) {
        super(name, price);
        this.millimeters = millimeters;
    }


    public double getMillimeters() {
        return millimeters;
    }
}
