package Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class app {
    public static void main(String[]args){
        List<Geometry> geom = Arrays.asList(new Circle("cercle",2),
                new Rectangle("rectangle",5,4),
                new Square("carre",6),
                new Ellipsis("ellipse",7,9));
        Collections.sort(geom);
        geom.stream().forEach(geo->System.out.println(geo.toString()));
    }
}
