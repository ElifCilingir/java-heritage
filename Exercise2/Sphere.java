package Exercise2;

public class Sphere extends Geometry3D {
    public Sphere(String name, double r) {
        this.name = name;
        this.r = r;
    }

    @Override
    double volume() {
        return 0;
    }

    @Override
    public double area() {
        return 4*Math.PI*Math.sqrt(r);
    }

    @Override
    public int compareTo(Geometry o) {
        return 0;
    }
}
