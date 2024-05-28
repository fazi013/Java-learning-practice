package Collections;




import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


public class arrylist {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(0);
    
    System.out.println(numbers);

    LinkedList<String> str = new LinkedList<String>();
    str.add("Faisal 1");
    str.add("Faisal 2");
    str.add("Faisal 3");
    str.add("Faisal 4");
    str.add("Faisal 5");
    System.out.println(str);
    System.out.println(str.get(1));
    
    }
    
    
}
