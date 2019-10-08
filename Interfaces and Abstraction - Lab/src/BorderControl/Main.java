package BorderControl;

import BorderControl.border.Citizen;
import BorderControl.border.Identifiable;
import BorderControl.border.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Identifiable> identifiable = new ArrayList<>();
        String input;

        while (!"End".equalsIgnoreCase(input = reader.readLine())) {
            String[] data = input.split("\\s+");
            if (data.length == 3) { // create citizen
                Citizen citizen = new Citizen(data[0], Integer.parseInt(data[1]), data[2]);
                identifiable.add(citizen);
            } else { //create robot
                Robot robot = new Robot(data[1], data[0]);
                identifiable.add(robot);
            }
        }
        String endsWith = reader.readLine();
        for (Identifiable id : identifiable) {
            if (id.getId().endsWith(endsWith)) {
                System.out.println(id.getId());
            }
        }
    }
}
