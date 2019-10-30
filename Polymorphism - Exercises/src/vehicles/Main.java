package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] data = reader.readLine().split("\\s+");
        Vehicles car = new Car(Double.parseDouble(data[1]), Double.parseDouble(data[2]));
        data = reader.readLine().split("\\s+");
        Vehicles truck = new Truck(Double.parseDouble(data[1]), Double.parseDouble(data[2]));
        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            data = reader.readLine().split("\\s+");
            switch (data[0]) {
                case "Drive":
                    switch (data[1]) {
                        case "Car":
                            car.drive(Double.parseDouble(data[2]));
                            break;
                        case "Truck":
                            truck.drive(Double.parseDouble(data[2]));
                            break;
                    }
                    break;
                case "Refuel":
                    switch (data[1]) {
                        case "Car":
                            car.refuel(Double.parseDouble(data[2]));
                            break;
                        case "Truck":
                            truck.refuel(Double.parseDouble(data[2]));
                            break;
                    }
                    break;
            }
        }
        System.out.println(car);
        System.out.println(truck);
    }
}
