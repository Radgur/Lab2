package geometry2d;

import exceptions.rectangle_exception;

public class Rectangle implements Figure{
    double a;
    double b;

    public Rectangle(double a, double b){
        try {
            if (a <= 0 || b <= 0) throw new rectangle_exception();
        } catch (rectangle_exception e) {
            System.out.println(e.getMessage());
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {return a * b;}

    @Override
    public double perimeter() {return 2*a + 2*b;}

    @Override
    public String toString() {
        return "Rectangle with sides: a = " + this.a + " b = " + this.b;
    }
}
