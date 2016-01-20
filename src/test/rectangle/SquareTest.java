package rectangle;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareTest {

    @Test
    public void shouldCalculatePerimeterGivenValidParam() {
        Square square = new Square(4.2);
        assertEquals(16.8, square.calculatePerimeter());
    }

    @Test
    public void shouldCalculateAreaGivenValidSide() {
        Square square = new Square(4.0);
        assertEquals(16.0, square.calculateArea());
    }

}
