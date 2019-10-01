package аnimals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animals> animalsList = new ArrayList<>();
        String input;
        while (!"Beast!".equals(input = scanner.nextLine())) {
            String classType = input.trim();
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            switch (classType) {
                case "Cat":
                    String gender = tokens[2];
                    Cat cat = new Cat(name,age,gender);
                    animalsList.add(cat);
                    break;
                case"Dog":
                    gender = tokens[2];
                    Dog dog = new Dog(name,age,gender);
                    animalsList.add(dog);
                    break;
                case "Frog":
                    gender = tokens[2];
                    Frog frog = new Frog(name,age,gender);
                    animalsList.add(frog);
                    break;
                case "Kitten":
                    Kitten kitten = new Kitten(name, age);
                    animalsList.add(kitten);
                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(name,age);
                    animalsList.add(tomcat);
                    break;
            }
        }
        animalsList.forEach(System.out::println);
    }
}

