@FunctionalInterface
/**
 * 
 */
interface   Name {  
public void name();
    
}
interface   Sqrt {
    public double sqrt(int a); 
    }



public class lambdaExpression {

    public static void main(String[] args) {
        Name na = ()-> System.out.println("My name is Faisal");    //default expression
        na.name();
        Sqrt st = s -> Math.sqrt(s);  //parameterized expression
        double result = st.sqrt(3);
        System.out.println(result);

    }
    
}
