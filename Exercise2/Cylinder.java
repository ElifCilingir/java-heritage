package Exercise2;

public class Cylinder extends Geometry3D {
    public Cylinder(String name, double r, double h) {
        this.name = name;
        this.r = r;
        this.h = h;
    }

    @Override
    double volume() {
        return Math.PI*Math.sqrt(r)*h;
    }

    @Override
    public double area() {
        return Math.PI*2*r*h;
    }

    @Override
    public int compareTo(Geometry o) {
        return 0;
    }
}
