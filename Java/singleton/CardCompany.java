package design_pattern.singleton;

public class CardCompany {
    private static CardCompany cardCompany = new CardCompany();

    private CardCompany() {
    }

    public Card createCard() {
        return new Card();
    }

    public static CardCompany getInstance() {
        if (cardCompany == null) {
            cardCompany = new CardCompany();
            return cardCompany;
        }
        return cardCompany;
    }
}
