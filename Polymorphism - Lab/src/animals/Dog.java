package animals;

public class Dog extends Animal {
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        StringBuilder sb = new StringBuilder();
        sb.append("I am ")
                .append(this.getName())
                .append(" and my favourite food is ")
                .append(this.getFavouriteFood())
                .append(System.lineSeparator())
                .append("DJAAF");

        return sb.toString();
    }
}
