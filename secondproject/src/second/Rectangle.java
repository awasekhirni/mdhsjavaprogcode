package second;

//concrete //more specific
public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double rlength, double rwidth) {
        super(color);
        this.length = rlength;
        this.width = rwidth;

    }

    @Override
    public double area() {

        return length * width;
    }

    @Override
    public double perimeter() {

        return 2 * (length + width);
    }

}
