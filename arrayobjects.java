
 class employees {

    String Name ;
    String Department;
    String Experience;
    int salary;

}





public class arrayobjects {
    public static void main(String [] args) {

        employees e1=new employees();
        e1.Name="Faisal";
        e1.Department= "finance";
        e1.Experience="5 years";
        e1.salary= 50000;


        employees e2=new employees();
        e2.Name="Ali";
        e2.Department= "finance";
        e2.Experience="4 years";
        e2.salary= 45000;

        employees e3=new employees();
        e3.Name="Ahamad";
        e3.Department= "finance";
        e3.Experience="8 years";
        e3.salary= 100000;

        employees e4=new employees();
        e4.Name="munib";
        e4.Department= "finance";
        e4.Experience="6 years";
        e4.salary= 80000;



        employees employ[]= new employees[4];  

        employ[0]=e1;
        employ[1]=e2;
        employ[2]=e3;
        employ[3]=e4;




       /*  for (int i=0;i<employ.length;i++){

            System.out.println(employ[i].Name  +  "  : " + employ[i].Department  +  "  : " + employ[i].Experience  +  "  : " +employ[i].salary  +  "  : "  );
        } */

        // using enhanced loop 

        for (employees emp : employ){

            System.out.println(emp.Name  +  "  : " + emp.Department  +  "  : " + emp.Experience  +  "  : " +emp.salary  +  "  : "  );

        }




    }
}
