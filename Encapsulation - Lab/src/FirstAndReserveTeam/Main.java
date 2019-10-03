package FirstAndReserveTeam;

import FirstAndReserveTeam.Team.Person;
import FirstAndReserveTeam.Team.Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Team team = new Team("Black angels");

        while (n-- > 0) {
            String[] data = reader.readLine().split("\\s+");
            Person person = new Person(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));
            team.addPlayer(person);
        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}

