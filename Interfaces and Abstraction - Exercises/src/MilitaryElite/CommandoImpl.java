package MilitaryElite;

import java.util.HashSet;
import java.util.Set;

public class CommandoImpl {

    private Set<Mission> missionSet;

    public CommandoImpl() {
        this.missionSet = new HashSet<>();
    }

    public void addMission(Mission mission){
        this.missionSet.add(mission);
    }

    public Set<Mission> getMissionSet() {
        return missionSet;
    }
}
