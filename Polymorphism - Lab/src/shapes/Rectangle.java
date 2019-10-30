package shapes;

public class Rectangle extends Shape {
    private Double	height;
    private Double	width ;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    private Double getHeight() {
        return height;
    }

    private Double getWidth() {
        return width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(this.getHeight()+this.getWidth());
    }

    @Override
    public double calculateArea() {
        return this.getWidth()*this.getHeight();
    }
}
