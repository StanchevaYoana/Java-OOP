package PizzaCalories;


public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", weight));
        }
        this.weight = weight;

    }

    private void setToppingType(String toppingType) {
        boolean notContain = true;
        for (ToppingsModifiers topping : ToppingsModifiers.values()) {
            if (topping.name().equalsIgnoreCase(toppingType)) {
                this.toppingType = toppingType;
                notContain = false;
                break;
            }
        }
        if (notContain) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    public double calculateCalories() {
        return (this.weight * 2) * (ToppingsModifiers.valueOf(this.toppingType.toUpperCase()).getValue());
    }
}
