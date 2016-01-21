package rectangle;

public class Rectangle implements Shape {
    private final double breadth;
    private final double length;

    private Rectangle(double length, double breadth) throws IllegalStateException {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalStateException("Length or breadth can not be negative or 0");
        }
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double calculateArea() {
        return this.length * this.breadth;
    }

    public static Shape getSquare(double side) {
        return new Rectangle(side, side);
    }

    public static Rectangle getRectangle(double length, double breadth) {
            return new Rectangle(length, breadth);
    }
}
