package Exercise3;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[]args){
        List<Building> builds = Arrays.asList(new Villa("Elif","3 allée qqch",12,10,true));
      //  Collections.sort(builds);
        builds.stream().forEach(build->System.out.println(build.print()));
    }
}
