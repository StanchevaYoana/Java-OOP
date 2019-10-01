package GreedyTimes.Items;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private long capacity;

    private List<List<Item>> items;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();

    }

    public long getCapacity() {
        return this.capacity;
    }

    private long getItemAmount(int index) {
        return this.items.get(index)
                .stream()
                .mapToLong(Item::getQuantity)
                .sum();
    }


    public void addGem(String name, long quantity) {
        if (this.getItemAmount(0) >= this.getItemAmount(1) + quantity) {
            this.capacity -= quantity;
            Item item = new Gems(name, quantity);
            this.items.get(1).add(item);
        }
    }

    public void addCash(String name, long quantity) {
        if (this.getItemAmount(1) >= this.getItemAmount(2) + quantity) {
            this.capacity -= quantity;
            Item item = new Cash(name, quantity);
            this.items.get(2).add(item);
        }
    }

    public void addGold(long quantity) {
        if (this.items.get(0).size() == 0) {
            this.items.get(0).add(new Gold(quantity));
        } else {
            this.items.get(0).get(0).addQuantity(quantity);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.items.get(0).get(0).toString()).append(System.lineSeparator());

        long goldAmount = this.getItemAmount(0);

        if (goldAmount != 0) {
            sb.append("##Gold - ").append(this.getItemAmount(0)).append(System.lineSeparator());
        }
        sb.append(this.items.get(1).toString()).append(System.lineSeparator());

        long gemAmount = this.getItemAmount(1);
        if (gemAmount != 0) {
            this.items.get(1).forEach(item -> sb.append(item.toString()).append(System.lineSeparator()));
        }
        sb.append(this.items.get(2).toString()).append(System.lineSeparator());

        long cashAmount = this.getItemAmount(2);
        if (cashAmount != 0) {
            this.items.get(2).forEach(item -> sb.append(item.toString()).append(System.lineSeparator()));
        }
        return sb.toString();
    }

}
