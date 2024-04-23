package program;

import shapes.Box;

public class Main2 {
    public static void main(String[] args) {
        Box b = new Box(10,20,15); // declare object from Box class
        System.out.println( "Box volume : " +   b.volume()); // non static method object.method()
        System.out.println( "Box area : " +   b.area()); // non static method object.method()

        System.out.println(Box.volume(5,7,8)); // static method
        System.out.println(Box.area(8,7,10));
    }





}
