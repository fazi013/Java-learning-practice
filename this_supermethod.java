public class this_supermethod{

    public static void main(String[] args) {
        B obj = new B();//for default constructors

        B obj1 = new B("prameter");  //for perameterized constructors 
        // hashcode and equal part
        boolean res = obj.equals(obj1);

        System.out.println(res);
    }


}

class A {

    int a =1;
    String s = "Faisal";
    public A(){     //default constructor

            System.out.println("we are in A class with default constuctor");

    }

    public A(String i){    //parameterized constructor

        System.out.println("we are in A class with parameterized constructor Anad the value is :" + i);

    }


}






class B extends A {

    int a =1;
    String s = "Faisal";
    public B(){     //default constructor
        this("calling in default constructor class B ");
                            //super method use to control the parent class constructoers.That help to programmer to control the execution of constructor which constructor will be using. 
        //super("super method in default constructor");  
        System.out.println("we are in B class with default constuctor");
        
    }
    public B(String i){    //parameterized constructor
           // this ();// this methodis use to call conststructor in same class with different parameter
        System.out.println("we are in B class with parameterized constructor Anad the value is :" + i);
        
    }

    // hashcode and equal part
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + ((s == null) ? 0 : s.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        B other = (B) obj;
        if (a != other.a)
            return false;
        if (s == null) {
            if (other.s != null)
                return false;
        } else if (!s.equals(other.s))
            return false;
        return true;
    }


}