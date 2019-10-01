package GreedyTimes.Items;

public class Gems extends Item {
    private String name;

   public Gems(String name, long quantity) {
        super(quantity);
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("##%s - $%d", this.name, this.getQuantity());
    }
}
