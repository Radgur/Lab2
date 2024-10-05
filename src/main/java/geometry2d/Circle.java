package geometry2d;

import exceptions.circle_exception;

import static java.lang.Math.PI;

public class Circle implements Figure{
    double r;

    public Circle(double r){
        try {
            if (r <= 0) throw new circle_exception();
        } catch (circle_exception e) {
            System.out.println(e.getMessage());
        }
        this.r = r;
    }

    @Override
    public double area() {return r*r * PI;}

    @Override
    public double perimeter() {return 2*r * PI;}

    @Override
    public String toString() {
        return "Circle with radius " + this.r;
    }
}
