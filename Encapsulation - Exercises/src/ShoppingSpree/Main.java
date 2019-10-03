package ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> peopleList = new HashMap<>();
        Map<String, Product> productList = new HashMap<>();

        String[] inputPersons = reader.readLine().split(";");
        for (String inputPerson : inputPersons) {
            String[] split = inputPerson.split("=");
            try {
                Person person = new Person(split[0], Double.parseDouble(split[1]));
                peopleList.put(split[0], person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String[] inputProducts = reader.readLine().split(";");

        for (String inputProduct : inputProducts) {
            String[] split = inputProduct.split("=");
            try {
                Product product = new Product(split[0], Double.parseDouble(split[1]));
                productList.put(split[0], product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String buyOrEnd;
        while (!"END".equals(buyOrEnd = reader.readLine())) {
            String[] split = buyOrEnd.split("\\s+");
            String person = split[0];
            String product = split[1];
            if (peopleList.isEmpty()) return;
            peopleList.get(person).buyProduct(productList.get(product));
        }


        for (Person value : peopleList.values()) {
            if (value.getProducts().isEmpty()) {
                System.out.println(value.getName() + " – Nothing bought");
            } else {
                System.out.println(value.toString());
            }
        }
    }
}
