package MilitaryElite;

public class Mission {
    private String codeName;
    private State state;

    public Mission(String codeName) {
        this.codeName = codeName;
        this.state = State.IN_PROGRESS;
    }

    public State getState() {
        return state;
    }

    public String getCodeName() {
        return this.codeName;
    }
}
