/* Write a Java program to create a Animal interface with a method called bark() that takes no arguments and
 returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking" */

interface Animal {
    public void bark();

}

class Dog implements Animal{
    public void bark() {
        System.out.println("Dog is barking");

    }
}

class Cat implements Animal{
    public void bark() {
        System.out.println("Cat is Carring");

    }
}
class Speak {
    public void sp(Animal A){
        A.bark();
    }
}

public class interfaces {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Speak sp = new Speak();
        sp.sp(cat);
        sp.sp(dog);



    }
    
}
