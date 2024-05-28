package Collections;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class streamconcept {

    public static void main(String[] args) {
        
        List <Integer> nums = Arrays.asList(0,1,8,3,4,5,9,7,2,6);
        Stream <Integer> st =nums.stream()
                                          .filter(n->n%2==0)
                                          .sorted();  
              
        System.out.println("my name"); 
        st.forEach(n-> System.out.println(n));                                   
    }
    
}
