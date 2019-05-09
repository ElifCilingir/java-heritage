package Exercise2;

public class Sphere extends Geometry3D {
    public Sphere(double r) {
        this.r = r;
    }

    @Override
    double volume() {
        return 0;
    }

    @Override
    double area() {
        return 4*Math.PI*Math.sqrt(r);
    }
}
