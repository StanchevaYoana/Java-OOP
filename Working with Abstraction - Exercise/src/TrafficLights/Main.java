package TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");

        int n = Integer.parseInt(reader.readLine());

        TrafficLight[] lights = new TrafficLight[input.length];

        for (int i = 0; i < input.length; i++) {
            lights[i] = TrafficLight.valueOf(input[i]);
        }

        StringBuilder sb = new StringBuilder();
        TrafficLight[] lightValues = {TrafficLight.RED, TrafficLight.GREEN, TrafficLight.YELLOW};

        while (n-- > 0) {
            for (int i = 0; i < lights.length; i++) {

                if (lights[i].ordinal() == 2) {
                    lights[i] = TrafficLight.RED;
                } else {
                    lights[i] = lightValues[lights[i].ordinal() + 1];
                }
                sb.append(lights[i].toString()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}