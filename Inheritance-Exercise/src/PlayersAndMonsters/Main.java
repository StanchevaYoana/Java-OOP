package PlayersAndMonsters;

import PlayersAndMonsters.hero.BladeKnight;
import PlayersAndMonsters.hero.SoulMaster;

public class Main {

    public static void main(String[] args) {
        BladeKnight sm = new BladeKnight("new hero", 3);
        System.out.println(sm.toString());
    }
}
