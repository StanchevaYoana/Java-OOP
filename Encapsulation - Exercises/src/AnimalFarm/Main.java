package AnimalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = reader.readLine();
            int age = Integer.parseInt(reader.readLine());
            Chicken chicken = new Chicken(name,age);
            System.out.println(chicken.toString());
        } catch (IllegalArgumentException | IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
