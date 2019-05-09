package Exercise2;

public abstract class Geometry2D implements Geometry{
    String name;
    double l,h,r,a,b;
    abstract double perimeter();
    public int compareTo(Geometry geo){
        if(area()>geo.area()){
            return 1;
        }
        else if(area()<geo.area()){
            return -1;
        }else{
            return 0;
        }
    }
}
