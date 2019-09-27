package CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cmd = reader.readLine();

        System.out.println(cmd + ":");

        for (int i = 0; i < Suits.values().length; i++) {
            String name = Suits.values()[i].toString();
            int value = Suits.valueOf(name).getValue();

            System.out.println(String.format("Ordinal value: %d; Name value: %s",value,name));

        }
    }
}
