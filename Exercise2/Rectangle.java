package Exercise2;

public class Rectangle extends Geometry2D {

    public Rectangle(String name, double l, double h) {
        this.name = name;
        this.l = l;
        this.h = h;
    }

    @Override
    double perimeter() {
        return 2*(l+h);
    }

    @Override
    public double area() {
        return l*h;
    }

    @Override
    public String toString() {
        return "area rectangle : "+area();
    }


}
