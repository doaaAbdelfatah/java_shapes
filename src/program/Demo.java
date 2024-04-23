package program;

public class Demo {

    public static void main(String[] args) {
      Demo d = new Demo(); // object
      d.sum(10,20) ; // not static method
    }
    public int sum(int x ,int y){
        return  x + y;
    }
}
