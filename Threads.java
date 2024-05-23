
class One extends Thread {    //thread must have run method to run
  public void run(){
    for (int i =0;i<111;i++){

        System.out.println("My name is faisal ammad ud din");
        try { Thread.sleep(30);} 
        catch (InterruptedException e) {e.printStackTrace();
        }
    }
    
  }



}


class Two extends Thread {    //thread must have run method to run
    public void run(){
        for (int i =0;i<111;i++){

            System.out.println("This is practice work");
            try { Thread.sleep(30);} 
        catch (InterruptedException e) {e.printStackTrace();
        }
    
    }


}
}
public class Threads {
    
    public static void main(String[] args) {

        One A = new One();
        Two B = new Two();
        B.start();
        A.start();
        

        
        
    }
}
