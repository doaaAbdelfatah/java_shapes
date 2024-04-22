package shapes;

public class Circle {
    private  double r ;

    public Circle(double r) { // constructor
        this.r = r;
    }

    public double getR() { // read ترجع قيمه المتغير
        return r;
    }


    public double area(){
//        return  Math.PI * this.r * this.r;
        return  Math.PI * Math.pow(this.r , 2); //A = πr^2 Math.pow(الاساس و الاس)
    }
}
