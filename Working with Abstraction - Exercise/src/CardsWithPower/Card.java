package CardsWithPower;

public class Card {

    public static int calculatePowerOfCard(CardSuits rank, CardRank card) {

        return rank.getValue() + card.getValue();
    }
}
