package Exercise2;

public class Ellipsis extends Geometry3D {
    public Ellipsis(double a, double b) {
        this.a=a;
        this.b=b;
    }

    @Override
    double volume() {
        return 0;
    }

    @Override
    double area() {
        return Math.PI*a*b;
    }
}
