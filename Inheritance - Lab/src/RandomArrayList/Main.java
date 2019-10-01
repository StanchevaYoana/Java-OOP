package RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList arrayList = new RandomArrayList();
        arrayList.add("Ivan");
        arrayList.add(159);
        arrayList.add('s');
        arrayList.add("Yoana");
        arrayList.add("Daria");
        arrayList.add("Stani");

        System.out.println(arrayList.getRandomElement());
        System.out.println(arrayList.getRandomElement());
        System.out.println(arrayList.getRandomElement());
        arrayList.removeElement();
        System.out.println();


    }
}
