package CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CardRank rank = CardRank.valueOf(reader.readLine());
        CardSuits card = CardSuits.valueOf(reader.readLine());

        int cardPower = Card.calculatePowerOfCard(card, rank);

        System.out.println(String.format("Card name: %s of %s; Card power: %d", rank, card, cardPower));
    }
}
