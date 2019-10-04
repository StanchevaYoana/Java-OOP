package PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] pizzaData = reader.readLine().split("\\s+");
        String [] doughData = reader.readLine().split("\\s+");
        Pizza pizza = null;
        try {
            pizza = new Pizza(pizzaData[1], Integer.parseInt(pizzaData[2]));
            Dough dough = new Dough(doughData[1], doughData [2], Integer.parseInt((doughData[3])));
            pizza.setDough(dough);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        String input;
        while (!"END".equalsIgnoreCase(input = reader.readLine())) {
            String[] data = input.split("\\s+");
            try {
                Topping topping = new Topping(data[1], Integer.parseInt(data[2]));
                if (pizza != null) {
                    pizza.addTopping(topping);
                }
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(pizza != null ? pizza.toString() : null);
    }
}
