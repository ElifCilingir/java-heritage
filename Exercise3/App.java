package Exercise3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[]args){
        List<Building> builds = Arrays.asList(new Villa("Elif","3 allée qqch",12,10,true),
                new Company("Me", "My company address", 190.5,"MyCompany", 6000, 1.3));
       // Collections.sort(builds);
      //  builds.stream().forEach(build->System.out.println(final double sum+=build.sumArea()));
        builds.stream().forEach(build->System.out.println(build.print()));
    }
}
