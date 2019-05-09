package Exercise2;

public class Cylinder extends Geometry3D {
    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    double volume() {
        return Math.PI*Math.sqrt(r)*h;
    }

    @Override
    double area() {
        return Math.PI*2*r*h;
    }
}
