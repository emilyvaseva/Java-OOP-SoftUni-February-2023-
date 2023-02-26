package P02WorkingWithAbstractionsExercise.P01CardSuit;

public class Main {
    enum CardSuit{
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        CardSuit[] values = CardSuit.values();
        for (CardSuit value : values) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value);
        }
    }
}
