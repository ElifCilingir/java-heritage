package Exercise2;

public class Circle extends Ellipsis {
    public Circle(double r) {
        super(r,r);
    }

    @Override
    double perimeter() {
        return Math.PI*2*r;
    }

    @Override
    double area() {
        return Math.PI*Math.sqrt(r);
    }
}
