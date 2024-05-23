

public class Exceptions {

public static void main(String[] args) {
    int i =1;
    int j=0;
    int arry[]=new int[2] ;
    try{
        j= 100/i;
        System.out.println(arry[1]);
        if(arry[1]==0){
            throw new Exception("go to the ");}
        
    }
    catch(ArithmeticException e){
        j=100/2;
        System.out.println("Arithmetic Exception "+ e );

    }
    catch(Exception e){
        System.out.println("output is wrong : " +e);

    }
    

    System.out.println(j);
}
    


    
}
