package rectangle;

public class Rectangle {
    private final double breadth;
    private final double length;

    public Rectangle(double length, double breadth) throws IllegalStateException {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalStateException("Length or breadth can not be negative or 0");
        }
        this.length = length;
        this.breadth = breadth;
    }


    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
