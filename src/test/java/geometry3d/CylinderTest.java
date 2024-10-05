package geometry3d;

import geometry2d.Circle;
import geometry2d.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {
        Rectangle rectangle = new Rectangle(5,3);
        Cylinder cylinder = new Cylinder(rectangle, 5);
        assertEquals(75, cylinder.volume());
        Circle circle = new Circle(5);
        cylinder = new Cylinder(circle, 3);
        assertEquals(75*Math.PI, cylinder.volume());
    }
}