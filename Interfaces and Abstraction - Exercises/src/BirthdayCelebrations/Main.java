package BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Birthable> listOfBirdtables = new ArrayList<>();
        String input;

        while (!"End".equalsIgnoreCase(input = reader.readLine())) {
            String[] data = input.split("\\s+");
            switch (data[0]) {
                case "Citizen":
                    Birthable citizen = new Citizen(data[1], Integer.parseInt(data[2]), data[3], data[4]);
                    listOfBirdtables.add(citizen);
                    break;
                case "Pet":
                    Birthable pet = new Pet(data[1], data[2]);
                    listOfBirdtables.add(pet);
                    break;
                case "Robot":
                    Identifiable robot = new Robot(data[2], data[1]);
                    break;
            }
        }

        String year = reader.readLine();
        boolean haveEquals = false;
        for (Birthable birthDate : listOfBirdtables) {
            if (birthDate.getBirthDate().endsWith(year)) {
                haveEquals = true;
                System.out.println(birthDate.getBirthDate());
            }
        }
        if (!haveEquals) {
            System.out.println("<no output>");
        }
    }
}
