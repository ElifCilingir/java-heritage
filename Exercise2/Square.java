package Exercise2;

public class Square extends Rectangle {
    public Square(double l) {
        super(l,l);
    }

    @Override
    double perimeter() {
        return 4*l;
    }

    @Override
    double area() {
        return Math.sqrt(l);
    }
}

