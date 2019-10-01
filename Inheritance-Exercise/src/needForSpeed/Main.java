package needForSpeed;

public class Main {
    public static void main(String[] args) {

        Motorcycle motor = new CrossMotorcycle(10,150);
        motor.drive(2);
        System.out.println(motor.getFuel());
        System.out.println(motor.getFuelConsumption());
    }
}
