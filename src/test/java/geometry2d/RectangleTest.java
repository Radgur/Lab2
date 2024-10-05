package geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        Rectangle rectangle = new Rectangle(5,3);
        assertEquals(15, rectangle.area());
    }

    @Test
    void perimeter() {
        Rectangle rectangle = new Rectangle(7,2);
        assertEquals(18, rectangle.perimeter());
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(4,3);
        assertEquals("Rectangle with sides: a = 4.0 b = 3.0", rectangle.toString());
    }
}