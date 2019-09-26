package PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        return this.topRight.getX() >= point.getX() && point.getX() >= this.bottomLeft.getX()
                && this.bottomLeft.getY() <= point.getY() && this.topRight.getY() >= point.getY();
    }
}
