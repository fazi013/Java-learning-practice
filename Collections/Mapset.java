package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapset {
public static void main(String[] args) {
    Map <String,Integer> ma = new HashMap<>();
    ma.put("Faisal", 70);
    ma.put("Faisal1", 80);
    ma.put("Faisal2", 60);
    ma.put("Faisal3", 50);
    ma.put("Faisal4", 90);
    ma.put("Faisal5", 40);
    System.out.println(ma);
    for (String str : ma.keySet()) {
        System.out.println(str +" : " + ma.get(str));
    }
}
}
