package Exercise2;

public class Rectangle extends Geometry2D {

    public Rectangle(double l, double h) {
        this.l = l;
        this.h = h;
    }

    @Override
    double perimeter() {
        return 2*(l+h);
    }

    @Override
    double area() {
        return l*h;
    }
}
