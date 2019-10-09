package FoodShortage.citizen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Buyer> listOfBuyers = new HashMap<>();

        int numOfBuyers = Integer.parseInt(reader.readLine());
        while (numOfBuyers-- > 0) {
            Buyer person = null;
            String[] data = reader.readLine().split("\\s+");
            if (data.length == 4) {
                person = new Citizen(data[0], Integer.parseInt(data[1]), data[2], data[3]);
            } else if (data.length == 3) {
                person = new Rebel(data[0], Integer.parseInt(data[1]), data[2]);
            }
            listOfBuyers.putIfAbsent(data[0], person);
        }

        String name;

        while (!"End".equalsIgnoreCase(name = reader.readLine())) {
            if (listOfBuyers.containsKey(name)) {
                listOfBuyers.get(name).buyFood();
            }
        }
        int sumOfFood = 0;
        for (Buyer buyer : listOfBuyers.values()) {
            sumOfFood += buyer.getFood();
        }
        System.out.println(sumOfFood);
    }
}
