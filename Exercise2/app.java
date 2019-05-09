package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[]args){
        List<Geometry> geom = new ArrayList<>();
        Circle c1= new Circle(2);
        geom.add(c1);
        Rectangle r1 = new Rectangle(5,4);
        geom.add(r1);
        Square s1 = new Square(6);
        geom.add(s1);
        Ellipsis e1 = new Ellipsis(7,9);
        geom.add(e1);
    }
}
