package Collections;




import java.util.ArrayList;
import java.util.Collection;


public class arrylist {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(0);
    
    System.out.println(numbers);

    Collection<String> str = new ArrayList<String>();
    str.add("Faisal");
    str.add("Faisal");
    str.add("Faisal");
    str.add("Faisal");
    str.add("Faisal");
    System.out.println(str);
    numbers.removeIf(num-> num==0);
    System.out.println(numbers);
    }
    
    
}
