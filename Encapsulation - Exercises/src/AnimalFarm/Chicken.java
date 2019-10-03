package AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private double calculateProductPerDay() {
        if (this.age < 6) {
            return 2;
        } else if (age > 11) {
            return 0.75;
        }
        return 1;

    }
    public double productPerDay() {
        return calculateProductPerDay();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Chicken " + this.getName() + " (age " + this.getAge() + ") can produce " + productPerDay() + " eggs per day.";
    }
}
