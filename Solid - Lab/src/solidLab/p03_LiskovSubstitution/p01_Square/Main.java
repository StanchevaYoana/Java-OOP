package solidLab.p03_LiskovSubstitution.p01_Square;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(2,5);
        Shape shape1 = new Square(5);

        System.out.println(shape.getArea());
        System.out.println(shape1.getArea());

    }
}
