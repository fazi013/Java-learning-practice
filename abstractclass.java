abstract class Car{

    public abstract void drive();//if we define abstrct method its important that the class should abstact class

    public void PlayMusic(){

        System.out.println("paly music");

    }

}

class Civic extends Car{

    public void drive(){ //it is important that drive class must define abstract method otherwise it gives error

        System.out.println("in drive ");
    }
}


public class abstractclass {

    public static void main(String[] args) {
        Car obj = new Civic();   //we can"t make object of abstract class .that way we make refrence of abstract class and object of drive class
        obj.PlayMusic();
        obj.drive();
    }
}