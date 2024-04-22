package shapes;

public  class Rect { // default  ,public
    // encapsulation
    private double width; // show in the class only
    // access_modifier data_type var_name;
    // private , - , protected , public
    private double length;

    public Rect( double width , double length){
        this.width =width;
        this.length= length;
    }

    public Rect(double length){
        this.width= length;
        this.length = length;
    }

    public double area(){
        return  this.width * this.length;
    }

    public  double getWidth(){
        return  this.width;
    }

    public  void  setWidth(double width){
        this.width = width;
    }
    // read length variable
    public  double getLength(){
        return  this.length;
    }

    // write in the length variable
    public  void  setLength(double length){
        this.length = length;
    }
}
