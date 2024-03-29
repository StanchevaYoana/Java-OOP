package CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cmd = reader.readLine();

        System.out.println(cmd + ":");
        for (Suits value : Suits.values()) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", value.ordinal(), value.name()));
        }
    }
}
