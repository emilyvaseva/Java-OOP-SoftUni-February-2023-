package P01WorkingWithAbstractionsExercise.P06GreedyTimes;

public class Item {
    private final   Type type;
    private final String itemName;
    private final long amount;

    public Item(Type type, String itemName, long amount) {
        this.type = type;
        this.itemName = itemName;
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public String getItemName() {
        return itemName;
    }

    public long getAmount() {
        return amount;
    }
}
