package P02WorkingWithAbstractionsExercise.P02CardRank;

public class Main {
    enum CardRank{
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KIN
    }
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        CardRank[] rank = CardRank.values();
        for (CardRank cardRank : rank) {
            System.out.println("Ordinal value: " + cardRank.ordinal() + "; Name value: " + cardRank);
        }

    }
}
