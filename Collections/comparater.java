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
        List <String> Str = new ArrayList<String>() ;
        Str.add("null");
        Str.add("Faisal");
        Str.add("Ahmad");
        Str.add("Akram Shahzad");
        Str.add("null the value");
        Str.add("numbers are equal");
        Str.add("null last");
        Collections.sort(Str,com);

        for(String n : Str){System.out.println(n);}
        


    }
    
    
}
