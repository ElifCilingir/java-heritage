package Exercise2;

public class Ellipsis extends Geometry2D {
    public Ellipsis(String name,double a, double b) {
        this.name = name;
        this.a=a;
        this.b=b;
    }

    @Override
    double perimeter() {
        return 0;
    }

    @Override
    public double area() {
        return Math.PI*a*b;
    }

    @Override
    public String toString() {
        return "area ellipsis : "+area();
    }
}
