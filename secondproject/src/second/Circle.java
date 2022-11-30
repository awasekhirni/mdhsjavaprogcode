package second;

import java.lang.Math;

//inherits abstract class
public class Circle extends Shape {

    public double radius;

    public Circle(String color, double cradius) {
        super(color);
        this.radius = cradius;

    }

    @Override
    public double area() {
        double myarea = Math.PI * radius * radius;
        return myarea;
    }

    @Override
    public double perimeter() {
        double myperi = 2 * Math.PI * radius;
        return myperi;
    }

}
