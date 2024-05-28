package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparater {
    public static void main(String[] args) {
        Comparator <String> com=new Comparator<String>(){
            public int compare (String s,String t){

                return Integer.compare(s.length(), t.length());
            }
        };
        List <String> str = new ArrayList<String>() ;
        str.add("null");
        str.add("Faisal");
        str.add("Ahmad");
        str.add("Akram Shahzad");
        str.add("null the value");
        str.add("numbers are equal");
        str.add("null last");
        Collections.sort(str,com);

        for(String n : str){System.out.println(n);}
        


    }
    
    
}
