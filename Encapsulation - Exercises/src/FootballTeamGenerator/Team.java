package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        Validator.validateName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        boolean playerFound = false;
        for (Player player : this.players) {
            if (player.getName().equalsIgnoreCase(playerName)) {
                playerFound = true;
                this.players.remove(player);
                break;
            }
        }
        if (!playerFound) {
            System.out.printf("Player %s is not in %s team.\n", playerName, this.getName());
        }
    }
    public double getRating() {
        double skillRating = 0;

        for (Player player : players) {
            skillRating += player.overallSkillLevel();
        }

        return skillRating;
    }
}

// + Team (String)
//-	setName(String) : void
//+	getName(): String
//+	addPlayer(Player) : void
//+	removePlayer(String) : void
//+	getRating() : double


