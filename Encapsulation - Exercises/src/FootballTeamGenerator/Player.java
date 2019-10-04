package FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public Player() {
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setEndurance(int endurance) {
        Validator.validatePlayerStars("Endurance", endurance);
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        Validator.validatePlayerStars("Sprint", sprint);
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        Validator.validatePlayerStars("Dribble", dribble);
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        Validator.validatePlayerStars("Passing", passing);
        this.passing = passing;
    }

    public void setShooting(int shooting) {
        Validator.validatePlayerStars("Shooting", shooting);
        this.shooting = shooting;
    }

    public double overallSkillLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5.0;
    }
}
