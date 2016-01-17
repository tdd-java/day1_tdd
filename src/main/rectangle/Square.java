package rectangle;

public class Square {

    private final double side;

    public Square(double side) {
        this.side = side;
    }


    public double calculatePerimeter() {
        return side * 4;
    }
}
