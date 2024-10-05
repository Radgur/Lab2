package geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        Circle circle = new Circle(5);
        assertEquals(25*Math.PI, circle.area());
    }

    @Test
    void perimeter() {
        Circle circle = new Circle(3);
        assertEquals(6*Math.PI, circle.perimeter());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(3);
        assertEquals("Circle with radius 3.0", circle.toString());
    }
}