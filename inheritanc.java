
/**
 *  advcal 
 */
 class  advcal extends calculator  {//calcuatoer is the class of classobject file  that we are using
public  double power (int num1,int num2){
        return Math.pow(num1, num2);

}
public double sqrt (int num){

    return Math.sqrt(num);
}
    
}





public class inheritanc  {       
    
    public static void main(String[] args) {
        advcal cal = new advcal();

     int result =cal.add(3,4);
     System .out .println("add method : "+result);
      result = cal.sub(10,7);
      System .out .println("subtraction method : "+result);
      double rel= cal.power(7, 10); 
      System .out .println("power method : "+rel);
      rel= cal.sqrt(7);
      System .out .println("square root method : "+rel);

    }
    


}
