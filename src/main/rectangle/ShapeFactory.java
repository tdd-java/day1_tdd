package rectangle;

public class ShapeFactory {


    public static Shape getRectangleWithEqualSide(double side) {
        return new Rectangle(side, side);
    }
}
