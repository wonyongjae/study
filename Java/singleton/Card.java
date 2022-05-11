package design_pattern.singleton;

public class Card {
    private static int cardNumber = 10000;

    public Card() {
    }

    public static int getCardNumber() {
        return ++cardNumber;
    }
}
