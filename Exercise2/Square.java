package Exercise2;

public class Square extends Rectangle {
    public Square(String name, double l) {
        super(name,l,l);
        this.name = name;
    }

    @Override
    double perimeter() {
        return 4*l;
    }

    @Override
    public double area() {
        return Math.sqrt(l);
    }
    @Override
    public String toString() {
        return "area square : "+area();
    }
}

