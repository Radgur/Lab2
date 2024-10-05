package geometry3d;

import geometry2d.Figure;
import exceptions.height_exception;

public class Cylinder{
    Figure base;
    double height;

    public Cylinder(Figure base, double height){
        this.base = base;
        try {
            if (height <= 0) throw new height_exception();
        } catch (height_exception e) {
            System.out.println(e.getMessage());
        }
        this.height = height;
    }

    public double volume() {return this.base.area() * this.height;}
}
