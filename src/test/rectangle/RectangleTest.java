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

}
