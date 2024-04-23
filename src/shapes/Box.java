package shapes;

public class Box {
    private  int width , length , height;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public  int volume(){ // الحجم // instance (object) method
        return  this.width * this.length * this.height; // class members
    }

    public int area(){
        return 2 * this.width * length + 2 * this.height * this.length + 2 * this.width * this.height;
    }

    public  static  int volume(int w ,int l ,int h){
        return  w* l * h;
    }

    public static  int area(int w ,int l ,int h){
        return 2 * w * l + 2 * h * l + 2 * w * h;
    }


}
