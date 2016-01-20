package rectangle;

public class Square implements Shape {

    private final double side;

    public Square(double side) {
        if (side <= 0 ) {
            throw new IllegalStateException("Side can not be negative or 0");
        }
        this.side = side;
    }

    public double calculatePerimeter() {
        return side * 4;
    }

    public double calculateArea() {
        return side * side;
    }
}
