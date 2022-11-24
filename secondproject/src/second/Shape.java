package second;

//abstract class
public abstract class Shape {

    public String color;

    // abstract methods
    public abstract double area();

    public abstract double perimeter();

    public Shape(String color) {
        System.out.println("Creating abstract shape");
        this.color = color;
    }

    // getter
    public String getColor() {
        return color;
    }

}
