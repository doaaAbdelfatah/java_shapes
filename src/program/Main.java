package program;

import shapes.Circle;
import shapes.Rect;


public class Main {
    public static void main(String[] args) {
        shapes.Rect r = new Rect(15, 8);
//        r.setWidth(17);
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        r.setWidth(14);
        r.setLength(17);
        System.out.println(r.area());
        Rect r2 = new Rect(10);
        System.out.println(r2.area());

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Circle c = new Circle(10);
        System.out.println(c.area());
        System.out.println(c.getR());
        Circle c2 = new Circle(5);
        System.out.println(c2.area());
        System.out.println(c2.getR());





    }
}
