package restaurant;

public class Main {
    public static void main(String[] args) {

       Coffee coffee = new Coffee("Lavazza", 1.2);
        System.out.println(coffee.getCaffeine());
        System.out.println(coffee.getMillimeters());
        System.out.println(coffee.getName());

    }
}
