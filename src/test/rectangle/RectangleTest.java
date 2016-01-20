package rectangle;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    @Test(expected=IllegalStateException.class)
    public void shouldThrowExceptionWhenCreatedWithInvalidParam(){
        new Rectangle(10.0, -1);
    }

    @Test
    public void shouldCalculatePerimeter(){
        Rectangle rectangle = new Rectangle(3.4, 4.1);
        assertEquals(15.0, rectangle.calculatePerimeter());
    }

    @Test
    public void shouldCalculateAreaGivenValidSide() {
        Rectangle rectangle  = new  Rectangle(5.0, 2.0);
        assertEquals(10.0, rectangle.calculateArea());
    }


}
