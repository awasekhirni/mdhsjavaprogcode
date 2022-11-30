import second.Circle;
import second.Rectangle;
import second.Shape;

public class main {

    public static void main(String[] args) {
        Shape sphere = new Circle("Black", 8);
        Shape cube = new Rectangle("Silver", 7, 5);
        System.out.println(sphere.toString());
        System.out.println(sphere.getColor());
        System.out.println(sphere.area());
        System.out.println(cube.toString());

    }

}
