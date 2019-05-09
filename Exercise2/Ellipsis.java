package Exercise2;

public class Ellipsis extends Geometry2D {
    public Ellipsis(double a, double b) {
        this.a=a;
        this.b=b;
    }

    @Override
    double perimeter() {
        return 0;
    }

    @Override
    double area() {
        return Math.PI*a*b;
    }
}
