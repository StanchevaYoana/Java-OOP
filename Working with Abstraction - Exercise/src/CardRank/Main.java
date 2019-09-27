package CardRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        System.out.println(input+":");

        for (int i = 0; i < CardRank.values().length; i++) {
            String cardName = CardRank.values()[i].toString();
            int value = CardRank.values()[i].getValue();

            System.out.println(String.format("Ordinal value: %d; Name value: %s", value, cardName));
        }
    }
}
