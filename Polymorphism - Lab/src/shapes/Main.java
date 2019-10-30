package shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0,1.0);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        Circle circle = new Circle(2);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}
