package FirstAndReserveTeam.Team;

import java.util.ArrayList;
import java.util.List;

public class Team  {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public void addPlayer(Person person){
        if (person.getAge() < 40){
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }

    public List<Person> getFirstTeam() {
        return firstTeam;
    }

    public List<Person> getReserveTeam() {
        return reserveTeam;
    }

    public String getName() {
        return name;
    }
}



