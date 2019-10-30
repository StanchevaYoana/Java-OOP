package vehiclesExtension.vehicles;


public class Bus extends Vehicles {

    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;
    private static final double AIR_CONDITION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption + AIR_CONDITION, tankCapacity);
    }
}
