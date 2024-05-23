
class First{

    public void show(){

        System.out.println("we are in show ");

    }

    class inner
            {
    
                public void innershow(){
                    System.out.println("in the inner class");
                }
        
    }

   static class staticinner
            {
    
                public void statiIinnerShow(){
                    System.out.println("in the Static inner class");
                }
        
    }



}

public class innerclass {

public static void main(String[] args) {
    First obj = new First();

    obj.show();;

    First.inner obj1 = obj.new inner(); //for create the object of inner class we need referace and object of outter class
    obj1.innershow();
    First.staticinner obj2 = new First.staticinner(); // for create the inner static class we dont need object of outter class
    obj2.statiIinnerShow(); 



}
    
}
