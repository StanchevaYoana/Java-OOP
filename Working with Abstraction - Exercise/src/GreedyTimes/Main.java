package GreedyTimes;

import GreedyTimes.Items.Bag;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] items = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(bagCapacity);


        for (int i = 0; i < items.length; i += 2) {
            String type = items[i];
            long quantity = Long.parseLong(items[i + 1]);

            if (type.length() == 3) {
                type = "Cash";
            } else if (type.toLowerCase().endsWith("gem")) {
                type = "Gem";
            } else if (type.toLowerCase().equals("gold")) {
                type = "Gold";
            }

            String name = items[i];
            if (bag.getCapacity() + quantity >= 0) {
                switch (type) {
                    case "Gem":
                        bag.addGem(name, quantity);
                        break;
                    case "Cash":
                        bag.addCash(name, quantity);
                        break;
                    case "Gold":
                        bag.addGold(quantity);
                        break;
                }
            }
        }

        System.out.println(Arrays.toString(items));
    }
}
