class calculator{

public int add(int a,int b){

    return a+b;
}


public int sub(int a,int b){
    return a-b;
}

public double divide(int a,int b){
    return a/b;
}

public int multi(int a,int b){
    return a*b;
}


}






public class classobject {


    public static void main(String[] args) {
        calculator cal = new calculator();

        int result=cal.add(4,5);
        System.out.println(result);


        result=cal.sub(10,12);
        System.out.println(result);
        
        
        double res=cal.divide(45,8);
        System.out.println(res);
        
        
        result=cal.multi(15, 07);
        System.out.println(result);
    }
    
}
