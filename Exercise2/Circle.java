package Exercise2;

public class Circle extends Ellipsis {
    public Circle(String name,double r) {
        super(name,r,r);
        this.name = name;
        this.r = r;
    }

    @Override
    double perimeter() {
        return Math.PI*2*r;
    }

    @Override
    public double area() {
        return Math.PI*Math.sqrt(r);
    }

    @Override
    public String toString() {
        return "area circle : "+area();
    }
}
