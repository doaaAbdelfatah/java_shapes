package program;

import shapes.Rect;

public class MainRect {
    public static void main(String[] args) {
//        Rect r1 = new Rect(10,20);
//        Rect myRect = new Rect(5,7);
//        Rect r = new Rect(10);
//        System.out.println(Rect.count);
//        Rect.count = 70;
//        System.out.println(myRect.count); // 70
//        System.out.println(r1.count); // 70
//        System.out.println(r1.getWidth()); // 10
//        System.out.println(myRect.getWidth()); // 5


        System.out.println(Rect.count); // 0

        Rect r = new Rect(4);
        System.out.println(Rect.count); // 1

        Rect rr = new Rect(10,20);
        System.out.println(Rect.count);
        System.out.println(Rect.COMPANY);

        Rect rrr = new Rect(15);
        System.out.println(Rect.count);



    }
}
